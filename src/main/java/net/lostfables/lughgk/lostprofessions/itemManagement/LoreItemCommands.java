package net.lostfables.lughgk.lostprofessions.itemManagement;

import co.lotc.core.bukkit.menu.Menu;
import co.lotc.core.bukkit.menu.MenuAction;
import co.lotc.core.bukkit.menu.MenuAgent;
import co.lotc.core.bukkit.menu.icon.Button;
import co.lotc.core.bukkit.menu.icon.Icon;
import co.lotc.core.bukkit.util.ItemUtil;
import co.lotc.core.command.annotate.Cmd;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoreItemCommands extends BaseCommand {

    private Lostprofessions plugin;

    public LoreItemCommands(Lostprofessions plugin) {
        this.plugin = plugin;
    }

    @Cmd(value = "Add items to the saved lore items.", permission = "lostprofessions.additem")
    public void addItem(CommandSender sender) {
        if(sender instanceof Player && sender.hasPermission("lostprofessions.additem")) {
            Player player = (Player) sender;
            if(addItemToTable(player.getInventory().getItemInMainHand())) {
                player.sendMessage(ChatColor.DARK_AQUA + "[LostProfessions] Item has been added to the lore item menu temporarily. Please run /liupdate to make recent changes permanent.");
            }
        }
    }

    private boolean addItemToTable(ItemStack item) {
        for(int index = 0; index < plugin.items.size()+1; index++) {
            if(plugin.items.get(index+1) != null) {
                if(plugin.items.get(index+1).getType() == Material.AIR) {
                    plugin.items.put(index+1, item);
                    return true;
                }
            } else {
                plugin.items.put(index+1, item);
                return true;
            }
        }
        return false;
    }

    @Cmd(value = "Opens the lore item menu.", permission = "lostprofessions.limenu")
    public void menu(CommandSender sender) {
        if(sender instanceof Player && sender.hasPermission("lostprofessions.menu")) {
            Player player = (Player) sender;
            Menu itemMenu = null;
            itemMenu = itemMenuBuilder(itemMenu);
            itemMenu.openSession(player);
            System.out.println(plugin.items.toString());
        }
        return;
    }

    private Menu itemMenuBuilder(Menu itemMenuBase) {

        ArrayList<Icon> icons = new ArrayList<>();

        try {
            for (int index = 0; index < plugin.items.size(); index++) {
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
