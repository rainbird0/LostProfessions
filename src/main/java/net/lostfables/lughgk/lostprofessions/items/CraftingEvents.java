package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class CraftingEvents implements Listener {

    public CraftingEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customCrafting(PrepareItemCraftEvent e){
        if(e.getInventory().getResult() != null && e.getInventory().getResult().getType() == Material.IRON_NUGGET) {
            for( int i = 0 ; i < e.getInventory().getSize() ; i++ ){
                final ItemStack item = e.getInventory().getItem(i);
                if(e.getInventory().getItem(i) != null) {
                    if(item.getType() == Material.IRON_INGOT) {
                        if(item.getItemMeta().getDisplayName().contains("Iron Ingot")){
                            e.getInventory().setResult(new ItemStack(Material.LEATHER, 1));
                        }
                    }
                }
            }
        }
    }
}
