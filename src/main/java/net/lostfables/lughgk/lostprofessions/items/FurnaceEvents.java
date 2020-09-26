package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.block.EnchantingTable;
import org.bukkit.block.Furnace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;


public class FurnaceEvents implements Listener {

    public FurnaceEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler
    public void furnaceInteractEvent(PlayerInteractEvent event) {
        try {
            if (event.getClickedBlock().getState() instanceof EnchantingTable || (event.getClickedBlock() != null && event.getClickedBlock().getType() == Material.ANVIL)) {
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                    event.setCancelled(true);
                }

            }
        } catch(NullPointerException ignored) {

        }

    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customBurnEvent(FurnaceBurnEvent e) {
        ItemStack source = ((Furnace) e.getBlock().getState()).getInventory().getSmelting();
        ItemStack fuel = ((Furnace) e.getBlock().getState()).getInventory().getFuel();
        if (source != null) {
            if (source.getType() == Material.IRON_ORE) {
                if (LostProfessionItems.checkItem(source, "Iron Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.COAL_ORE) {
                if (LostProfessionItems.checkItem(source, "Tungsten Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.DIORITE) {
                if (LostProfessionItems.checkItem(source, "Silver Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.GOLD_ORE) {
                if (LostProfessionItems.checkItem(source, "Gold Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.MAGMA_BLOCK) {
                if (LostProfessionItems.checkItem(source, "Meteoric Metal Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.IRON_BLOCK) {
                if (LostProfessionItems.checkItem(source, "Platinum Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.LAPIS_ORE) {
                if (LostProfessionItems.checkItem(source, "Cobalt Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.REDSTONE_ORE) {
                if (LostProfessionItems.checkItem(source, "Calamite Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.SMOOTH_RED_SANDSTONE) {
                if (LostProfessionItems.checkItem(source, "Palladium Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.PURPLE_GLAZED_TERRACOTTA) {
                if (LostProfessionItems.checkItem(source, "Lither Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.SMOOTH_QUARTZ) {
                if (LostProfessionItems.checkItem(source, "Tin Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.PRISMARINE) {
                if (LostProfessionItems.checkItem(source, "Luminide Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            } else if (source.getType() == Material.ORANGE_TERRACOTTA) {
                if (LostProfessionItems.checkItem(source, "Copper Ore", "Metal")) {
                    return;
                }
                e.setCancelled(true);
            }
        }

    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customSmeltEvent(FurnaceSmeltEvent e) {
        ItemStack item;
        if(e.getSource().getType() == Material.IRON_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Iron Ore", "Metal")) {
                item = LostProfessionItems.ironIngot();
                e.setResult(item);
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.COAL_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Tungsten Ore", "Metal")) {
                e.setResult(LostProfessionItems.tungstenIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.DIORITE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Silver Ore", "Metal")) {
                e.setResult(LostProfessionItems.silverIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.GOLD_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Gold Ore", "Metal")) {
                e.setResult(LostProfessionItems.goldIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.MAGMA_BLOCK) {
            if (LostProfessionItems.checkItem(e.getSource(), "Meteoric Metal Ore", "Metal")) {
                e.setResult(LostProfessionItems.meteoricMetalIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.IRON_BLOCK) {
            if (LostProfessionItems.checkItem(e.getSource(), "Platinum Ore", "Metal")) {
                e.setResult(LostProfessionItems.platinumIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.LAPIS_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Cobalt Ore", "Metal")) {
                e.setResult(LostProfessionItems.cobaltIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.REDSTONE_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Calamite Ore", "Metal")) {
                e.setResult(LostProfessionItems.calamiteIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_RED_SANDSTONE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Palladium Ore", "Metal")) {
                e.setResult(LostProfessionItems.palladiumIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.PURPLE_GLAZED_TERRACOTTA) {
            if (LostProfessionItems.checkItem(e.getSource(), "Lither Ore", "Metal")) {
                e.setResult(LostProfessionItems.litherCoal());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_QUARTZ) {
            if (LostProfessionItems.checkItem(e.getSource(), "Tin Ore", "Metal")) {
                e.setResult(LostProfessionItems.tinIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.PRISMARINE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Luminide Ore", "Metal")) {
                e.setResult(LostProfessionItems.luminideIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.ORANGE_TERRACOTTA) {
            if (LostProfessionItems.checkItem(e.getSource(), "Copper Ore", "Metal")) {
                e.setResult(LostProfessionItems.copperIngot());
                for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
                    p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                }
                return;
            }
            e.setCancelled(true);
            return;
        }

        for(Player p : e.getBlock().getLocation().getNearbyPlayers(10)) {
            p.playSound(e.getBlock().getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
        }

    }
}
