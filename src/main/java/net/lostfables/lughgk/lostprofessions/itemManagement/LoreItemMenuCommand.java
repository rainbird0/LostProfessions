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
import java.util.HashMap;
import java.util.Map;

public class LoreItemMenuCommand implements CommandExecutor {

    Lostprofessions plugin;

    public LoreItemMenuCommand(Lostprofessions plugin) {
        this.plugin = plugin;
        plugin.getCommand("limenu").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player && sender.hasPermission("lostprofessions.menu")) {
            Player player = (Player) sender;
            Menu itemMenu = null;
            itemMenu = itemMenuBuilder(itemMenu);
            itemMenu.openSession(player);
        }
        return false;
    }

    private Menu itemMenuBuilder(Menu itemMenuBase) {

        ArrayList<Icon> icons = new ArrayList<>();

        try {
            for (int index = 0; index < plugin.getCurrentItemIDs(); index++) {
                int finalIndex = index;
                Icon item = new Button() {
                    @Override
                    public ItemStack getItemStack(MenuAgent menuAgent) {
                        return plugin.items.get(finalIndex+1);
                    }

                    @Override
                    public void click(MenuAction menuAction) {
                        menuAction.getPlayer().setItemOnCursor(plugin.items.get(finalIndex+1));
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
