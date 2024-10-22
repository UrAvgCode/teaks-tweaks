package me.teakivy.teakstweaks.packs.miniblocks;

import me.teakivy.teakstweaks.packs.BasePack;
import me.teakivy.teakstweaks.packs.PackType;
import me.teakivy.teakstweaks.utils.miniblock.MiniBlockUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.StonecuttingRecipe;

public class MiniBlocks extends BasePack {

    public MiniBlocks() {
        super("mini-blocks", PackType.SURVIVAL, Material.STONECUTTER);
    }

    @Override
    public void init() {
        super.init();
        for (StonecuttingRecipe recipe : MiniBlockUtils.getAllStonecuttingRecipes()) {
            addRecipe(recipe);
        }
    }
}
