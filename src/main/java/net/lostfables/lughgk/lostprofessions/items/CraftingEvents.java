package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CraftingEvents implements Listener {

    public CraftingEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler(ignoreCancelled = true)
    public void onJoinEvent(PlayerJoinEvent event) {
        event.getPlayer().discoverRecipes(Lostprofessions.get().getKeySet());
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customCrafting(PrepareItemCraftEvent e) {
        if (e.getInventory().getResult() != null) {

        //METALPIECE
        if (e.getInventory().getResult().equals(LostProfessionItems.metalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && item.getType() == Material.IRON_INGOT) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }


            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.metalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        if (e.getInventory().getResult().equals(LostProfessionItems.softMetalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && item.getType() == Material.BRICK) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.softMetalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        if (e.getInventory().getResult().equals(LostProfessionItems.hardMetalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && item.getType() == Material.NETHER_BRICK) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.hardMetalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        //METALINGOT
        if (e.getInventory().getResult().equals(LostProfessionItems.ironIngot())) {
            List<Component> metal = new ArrayList<>();


            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && item.getType() == Material.IRON_NUGGET) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(metal.get(0).getItem());
            return;
        }

            //BUCKET
            if (e.getInventory().getResult().equals(LostProfessionItems.bucket())) {
                List<Component> metal = new ArrayList<>();


                for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.bucket());
                return;
            }

            //BARS
            if (e.getInventory().getResult().equals(LostProfessionItems.iron_bars())) {
                List<Component> metal = new ArrayList<>();


                for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                    if (item != null && (item.getType() == Material.IRON_INGOT)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }
                ItemStack item = LostProfessionItems.iron_bars();
                item.setAmount(16);
                e.getInventory().setResult(item);
                return;
            }

            //SHOVEL
            if (e.getInventory().getResult().equals(LostProfessionItems.shovel(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.shovel(metal.get(0)));
                return;
            }


        //PICKAXE
        if (e.getInventory().getResult().equals(LostProfessionItems.pickaxe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.pickaxe(metal.get(0)));
            return;
        }

        //HOE
        if (e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.hoe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.hoe(metal.get(0)));
            return;
        }

        //WOODCUTTER'S AXE
        if (e.getInventory().getResult().equals(LostProfessionItems.woodcutteraxe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : Arrays.asList(e.getInventory().getMatrix())) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.woodcutteraxe(metal.get(0)));
            return;
        }
        }
    }
}
