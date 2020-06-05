package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class CraftingEvents implements Listener {

    public CraftingEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customCrafting(PrepareItemCraftEvent e){
        if(e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.metalPiece(Component.BLUEPRINT))) {

            for(int i = 1; i <= e.getInventory().getMatrix().length; i++) {
                try {
                    ItemStack item = LostProfessionItems.metalPiece(Component.getFromString(e.getInventory().getItem(i).getItemMeta().getDisplayName()));
                    item.setAmount(5);
                    e.getInventory().setResult(item);
                } catch(Exception ex) {

                }
            }

            return;
        }
        if(e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.pickaxe(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();
            List<Component> stick = new ArrayList<>();

            try {
                metal.add(Component.getFromString(e.getInventory().getItem(1).getItemMeta().getDisplayName()));
                metal.add(Component.getFromString(e.getInventory().getItem(2).getItemMeta().getDisplayName()));
                metal.add(Component.getFromString(e.getInventory().getItem(3).getItemMeta().getDisplayName()));
            } catch(NullPointerException ignored) {
                e.getInventory().setResult(null);
                return;
            }

            for(int i = 1; i < metal.size(); i++) {
                if(!metal.get(i).equals(metal.get(i-1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.pickaxe(metal.get(0)));
            return;
        }

        if(e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.shovel(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();
            List<Component> stick = new ArrayList<>();

            try {
                metal.add(Component.getFromString(e.getInventory().getItem(2).getItemMeta().getDisplayName()));
            } catch(NullPointerException ignored) {
                e.getInventory().setResult(null);
                return;
            }

            for(int i = 1; i < metal.size(); i++) {
                if(!metal.get(i).equals(metal.get(i-1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.shovel(metal.get(0)));
            return;
        }

        if(e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.hoe(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList();
            List<Component> stick = new ArrayList();

            try {
                metal.add(Component.getFromString(e.getInventory().getItem(1).getItemMeta().getDisplayName()));
                metal.add(Component.getFromString(e.getInventory().getItem(2).getItemMeta().getDisplayName()));
            } catch(NullPointerException ignored) {
                e.getInventory().setResult(null);
                return;
            }

            for(int i = 1; i < metal.size(); i++) {
                if(!metal.get(i).equals(metal.get(i-1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.hoe(metal.get(0)));
            return;
        }
    }
}
