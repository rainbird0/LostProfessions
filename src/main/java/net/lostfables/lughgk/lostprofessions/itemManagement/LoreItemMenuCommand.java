package net.lostfables.lughgk.lostprofessions.itemManagement;

import co.lotc.core.bukkit.menu.Menu;
import co.lotc.core.bukkit.menu.MenuAction;
import co.lotc.core.bukkit.menu.MenuAgent;
import co.lotc.core.bukkit.menu.icon.Button;
import co.lotc.core.bukkit.menu.icon.Icon;
import co.lotc.core.bukkit.util.ItemUtil;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoreItemMenuCommand implements CommandExecutor {

    Lostprofessions plugin;

    public LoreItemMenuCommand(Lostprofessions plugin) {
        this.plugin = plugin;
        plugin.getCommand("limenu").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            Menu itemMenu = null;
            itemMenu = itemMenuBuilder(itemMenu);
            itemMenu.openSession(player);
        }
        return false;
    }

    private Menu itemMenuBuilder(Menu itemMenuBase) {

        ArrayList<Icon> icons = new ArrayList<>();
        ArrayList<ItemStack> items = new ArrayList<>();

        try {
            plugin.getSQLControl().openConnection();
            PreparedStatement statement = plugin.getConnection().prepareStatement("SELECT * FROM " + plugin.getTable().get(0));
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                //try {
                    items.add(ItemUtil.getItemFromYaml(rs.getString(2)));
                //}catch(Exception e) {

                //}
            }
            plugin.getConnection().close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            for (int index = 0; index < items.size(); index++) {
                int finalIndex = index;
                Icon item = new Button() {
                    @Override
                    public ItemStack getItemStack(MenuAgent menuAgent) {
                        return items.get(finalIndex);
                    }

                    @Override
                    public void click(MenuAction menuAction) {
                        menuAction.getPlayer().setItemOnCursor(items.get(finalIndex));
                    }
                };

                icons.add(item);
            }
        } catch(IndexOutOfBoundsException e) {
            plugin.getLogger().info("There aren't any valid lore items in the database!");
        }


        itemMenuBase = itemMenuBase.fromIcons("Lore Items", icons);

        return itemMenuBase;
        }


}
