package net.lostfables.lughgk.lostprofessions;

import co.lotc.core.bukkit.command.Commands;
import co.lotc.core.bukkit.util.ItemUtil;
import net.lostfables.lughgk.lostprofessions.itemManagement.LoreItemCommands;
import net.lostfables.lughgk.lostprofessions.items.LostProfessionItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Lostprofessions extends JavaPlugin {

    private static Lostprofessions instance;
    private MySQLController SQLControl;
    private Connection connection;
    private String host,database,username,password;
    private List<String> table;
    private int port, currentItemIDs;
    public Map<Integer, ItemStack> items = new HashMap<>();

    public final static String BASE_PERMISSION = "LostProfessions";



    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        SQLControl = new MySQLController(this);
        SQLControl.mysqlSetup();
        updateCurrentItems();

        new LostProfessionItems();

        Commands.build(getCommand("loreitems"), () -> new LoreItemCommands(this));


        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void updateCurrentItems() {
        try {
            getSQLControl().openConnection();
            PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM " + getTable().get(0));
            ResultSet rs = statement.executeQuery();

            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
                items.put(id, ItemUtil.getItemFromYaml(rs.getString(2)));
            }
            setCurrentItemIDs(id);

            for(int index = 1; index < getCurrentItemIDs(); index++) {
                if(items.get(index) != null) {
                    //do nothing
                } else {
                    items.put(index, new ItemStack(Material.AIR));
                    statement = getConnection().prepareStatement("INSERT INTO " + getTable().get(0) + " (ID,ITEM) VALUES (?,?)");
                    statement.setInt(1, index);
                    statement.setString(2, ItemUtil.getItemYaml(items.get(index)));
                    statement.executeUpdate();
                }
            }
            getConnection().close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void setCurrentItemIDs(int currentItemIDs) {
        this.currentItemIDs = currentItemIDs;
    }

    @Deprecated
    public int getCurrentItemIDs() {
        return currentItemIDs;
    }

    public static Lostprofessions get() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getTable() {
        return table;
    }

    public void setTable(List<String> table) {
        this.table = table;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public MySQLController getSQLControl() {
        return SQLControl;
    }
}
