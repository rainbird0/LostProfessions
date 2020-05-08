package net.lostfables.lughgk.lostprofessions;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.Plugin;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;


public class MySQLController {

    private Lostprofessions plugin;


    public MySQLController(Lostprofessions plugin) {
        this.plugin = plugin;
    }




    public void mysqlSetup() {
        try {
            plugin.setHost(plugin.getConfig().getString("host"));
            plugin.setPort(plugin.getConfig().getInt("port"));
            plugin.setDatabase(plugin.getConfig().getString("database"));
            plugin.setUsername(plugin.getConfig().getString("username"));
            plugin.setPassword(plugin.getConfig().getString("password"));
            plugin.setTable((List<String>) plugin.getConfig().getList("table"));
            plugin.getLogger().info(ChatColor.GREEN + "Successfully pulled information from config.yml");
            if(openNoDBConnection()) {
                PreparedStatement create = plugin.getConnection().prepareStatement("CREATE DATABASE IF NOT EXISTS " + plugin.getDatabase());
                create.executeUpdate();
                plugin.getConnection().close();
                if(openConnection()) {
                    create = plugin.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS " + plugin.getTable().get(0) + "(ID INT, ITEM TEXT, PRIMARY KEY(ID))");
                    create.executeUpdate();
                }

            }



        } catch (Exception e) {
            plugin.getLogger().info("Exception while setting up mySQL.");
            e.printStackTrace();
        }
    }

    private boolean openNoDBConnection() {
        try {
            synchronized (this) {

                if (plugin.getConnection() != null && !plugin.getConnection().isClosed()) {
                    return true;
                }

                Class.forName("com.mysql.jdbc.Driver");
                plugin.setConnection(DriverManager.getConnection("jdbc:mysql://" + plugin.getHost() + ":" + plugin.getPort() + "/?", plugin.getUsername(), plugin.getPassword()));

                return true;


            }

        } catch(Exception e){
            plugin.getLogger().info(ChatColor.DARK_RED + "Could not connect to SQL");
            return false;
        }
    }

    public boolean openConnection() {
        try {
            synchronized (this) {

                if (plugin.getConnection() != null && !plugin.getConnection().isClosed()) {
                    return true;
                }

                Class.forName("com.mysql.jdbc.Driver");
                plugin.setConnection(DriverManager.getConnection("jdbc:mysql://" + plugin.getHost() + ":" + plugin.getPort() + "/" + plugin.getDatabase(), plugin.getUsername(), plugin.getPassword()));

                return true;


            }

        } catch(Exception e){
            plugin.getLogger().info(ChatColor.DARK_RED + "Could not connect to SQL");
            return false;
        }
    }


}
