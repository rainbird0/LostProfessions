package net.lostfables.lughgk.lostprofessions;

import net.lostfables.lughgk.lostprofessions.itemManagement.AddItemCommand;
import net.lostfables.lughgk.lostprofessions.itemManagement.LoreItemMenuCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public final class Lostprofessions extends JavaPlugin {

    private static Lostprofessions instance;
    private MySQLController SQLControl;
    private Connection connection;
    private String host,database,username,password;
    private List<String> table;
    private int port, currentItemIDs;


    @Override
    public void onEnable() {
        saveDefaultConfig();
        SQLControl = new MySQLController(this);
        SQLControl.mysqlSetup();
        updateCurrentItemIDs();

        new LoreItemMenuCommand(this);
        new AddItemCommand(this);


        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void updateCurrentItemIDs() {
        try {
            getSQLControl().openConnection();
            PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM " + getTable().get(0) + " WHERE ID=(SELECT MAX(ID) FROM " + getTable().get(0) + ");");
            ResultSet results = statement.executeQuery();
            results.next();
            setCurrentItemIDs(results.getInt("ID"));
            getConnection().close();
        } catch (SQLException e) {
            getLogger().info("Could not update current amount of stored lore items! This is probably not an error if on install.");
        }
    }

    public void setCurrentItemIDs(int currentItemIDs) {
        this.currentItemIDs = currentItemIDs;
    }

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
