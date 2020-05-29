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
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LoreItemCommands extends BaseCommand {

    private Lostprofessions plugin;

    public LoreItemCommands(Lostprofessions plugin) {
        this.plugin = plugin;
    }

    @Cmd(value = "Add items to the saved lore items.", permission = Lostprofessions.BASE_PERMISSION + ".additem")
    public void additem(CommandSender sender) {
        if(sender instanceof Player && sender.hasPermission(Lostprofessions.BASE_PERMISSION + "additem")) {
            Player player = (Player) sender;
            if(addItemToTable(player.getInventory().getItemInMainHand())) {
                player.sendMessage(ChatColor.DARK_AQUA + "[LostProfessions] Item has been added to the lore item menu.");
            } else {
                player.sendMessage(ChatColor.DARK_AQUA + "[LostProfessions] This is not a valid item!");
            }
        }
    }

    private boolean addItemToTable(ItemStack item) {
        Category[] categories = Category.values();
        if(!item.hasItemMeta() || !item.getItemMeta().hasLore()) {
            return false;
        }
        for(int index = 1; index <= plugin.items.size(); index++) {
                if (plugin.items.get(index) != null) {
                        plugin.items.put(index, item);
                        return true;
                } else {
                    plugin.items.put(index, item);
                    return true;
                }
        }
        return false;
    }

    @Cmd(value = "Opens the lore item menu.", permission = Lostprofessions.BASE_PERMISSION + ".menu")
    public void menu(CommandSender sender) {
        if(sender instanceof Player && sender.hasPermission(Lostprofessions.BASE_PERMISSION + "menu")) {
            Player player = (Player) sender;
            Menu itemMenu = null;
            itemMenu = categoryMenu(itemMenu);
            itemMenu.openSession(player);
        }
        return;
    }

    private Menu categoryMenu(Menu itemMenuBase) {
        ArrayList<Icon> icons = new ArrayList<>();
        Category[] categories = Category.values();

        for (int index = 0; index < categories.length; index++) {

            ItemStack is = ItemUtil.getSkullFromTexture(categories[index].skullTexture);
            ItemMeta im = is.getItemMeta();
            im.setDisplayName(categories[index].name);
            is.setItemMeta(im);
            int finalIndex = index;

            Icon item = new Button() {
                @Override
                public ItemStack getItemStack(MenuAgent menuAgent) {
                    return is;
                }

                @Override
                public void click(MenuAction menuAction) {
                    menuAction.getMenuAgent().close();
                    Menu testMenu = null;
                    testMenu = itemMenuBuilder(testMenu, categories[finalIndex]);
                    testMenu.openSession(menuAction.getPlayer());


                }
            };

            icons.add(item);
        }
        itemMenuBase = itemMenuBase.fromIcons("Category", icons);

        return itemMenuBase;
    }

    private Menu itemMenuBuilder(Menu itemMenuBase, Category category) {

        ArrayList<Icon> icons = new ArrayList<>();

        try {
            for (int index = 1; index <= plugin.items.size(); index++) {
                int finalIndex = index;
                if(plugin.items.get(finalIndex).hasItemMeta() && plugin.items.get(index).getItemMeta().hasLore() && plugin.items.get(finalIndex).getItemMeta().getLore().get(0).contains(category.name)) {
                    Icon item = new Button() {
                        @Override
                        public ItemStack getItemStack(MenuAgent menuAgent) {
                            return plugin.items.get(finalIndex);
                        }

                        @Override
                        public void click(MenuAction menuAction) {
                            menuAction.getPlayer().setItemOnCursor(plugin.items.get(finalIndex + 1));
                        }
                    };

                    icons.add(item);
                }
            }
        } catch(IndexOutOfBoundsException e) {
            plugin.getLogger().info("There aren't any valid lore items in the database!");
        }


        itemMenuBase = itemMenuBase.fromIcons("Lore Items", icons);

        return itemMenuBase;
    }

}
