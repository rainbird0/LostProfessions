package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.enums.Aura;
import net.lordofthecraft.itemedit.enums.Rarity;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.ItemStack;

public enum Component {
    BLUEPRINT(ChatColor.STRIKETHROUGH + "<MATERIAL>", Rarity.VCOMMON, Aura.MUNDANE, null),
    COPPER("Copper", Rarity.VCOMMON, Aura.MUNDANE, LostProfessionItems.copperIngot()),
    TIN("Tin", Rarity.VCOMMON, Aura.MUNDANE, LostProfessionItems.tinIngot()),
    IRON("Iron", Rarity.COMMON, Aura.MUNDANE, LostProfessionItems.ironIngot()),
    GOLD("Gold", Rarity.UNCOMMON, Aura.MUNDANE, LostProfessionItems.goldIngot()),
    SILVER("Silver", Rarity.UNCOMMON, Aura.MUNDANE, LostProfessionItems.silverIngot()),
    TUNGSTEN("Tungsten", Rarity.UNCOMMON, Aura.MUNDANE, LostProfessionItems.tungstenIngot()),
    METEORITE("Meteoric Metal", Rarity.RARE, Aura.MUNDANE, LostProfessionItems.meteoricMetalIngot()),
    PLATINUM("Platinum", Rarity.RARE, Aura.MUNDANE, LostProfessionItems.platinumIngot()),
    LUMINIDE("Luminide", Rarity.RARE, Aura.MUNDANE, LostProfessionItems.luminideIngot()),
    COBALT("Cobalt", Rarity.WONDROUS, Aura.MUNDANE, LostProfessionItems.cobaltIngot()),
    LITHER("Lither", Rarity.WONDROUS, Aura.MUNDANE, LostProfessionItems.litherCoal()),
    PALLADIUM("Palladium", Rarity.WONDROUS, Aura.MUNDANE, LostProfessionItems.palladiumIngot()),
    CALAMITE("Calamite", Rarity.WONDROUS, Aura.MUNDANE, LostProfessionItems.calamiteIngot());

    private String name;
    private Rarity rarity;
    private ItemStack item;
    private Aura aura;

    Component(String name, Rarity rarity, Aura aura, ItemStack item) {
        this.name = name;
        this.rarity = rarity;
        this.item = item;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    public ItemStack getItem() {
        return item;
    }

    public static Component getFromString(String fromString) {
        Component component = BLUEPRINT;
        for(Component c : Component.values()) {
            if(fromString.toUpperCase().contains(c.getName().toUpperCase())) {
                component = c;
            }
        }
        return component;
    }

}
