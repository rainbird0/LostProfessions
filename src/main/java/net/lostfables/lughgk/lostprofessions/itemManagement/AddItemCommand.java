package net.lostfables.lughgk.lostprofessions.itemManagement;

import co.lotc.core.bukkit.util.ItemUtil;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddItemCommand implements CommandExecutor {

    Lostprofessions plugin;

    public AddItemCommand(Lostprofessions plugin) {
        this.plugin = plugin;
        plugin.getCommand("liadd").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player && sender.hasPermission("LostProfessions.additem")) {
            Player player = (Player) sender;
            if(addItemToTable(player.getInventory().getItemInMainHand())) {
                player.sendMessage(ChatColor.DARK_AQUA + "[LostProfessions] Item has been added to the lore item menu.");
            }


        }

        return false;
    }

    private boolean addItemToTable(ItemStack item) {
        try {
            plugin.getSQLControl().openConnection();
            PreparedStatement statement = plugin.getConnection().prepareStatement("INSERT INTO " + plugin.getTable().get(0) + " (ID,ITEM) VALUES (?,?)");
            statement.setString(2, ItemUtil.getItemYaml(item));
            statement.setInt(1, plugin.getCurrentItemIDs()+1);
            plugin.setCurrentItemIDs(plugin.getCurrentItemIDs()+1);
            statement.executeUpdate();
            plugin.getConnection().close();
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

}
