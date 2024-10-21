package me.teakivy.teakstweaks.craftingtweaks.recipes;

import me.teakivy.teakstweaks.craftingtweaks.AbstractCraftingTweak;
import me.teakivy.teakstweaks.utils.Key;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CharcoalToBlackDye extends AbstractCraftingTweak {

    public CharcoalToBlackDye() {
        super("charcoal-to-black-dye", Material.CHARCOAL);
    }

    @Override
    public void registerRecipes() {
        ShapelessRecipe recipe = new ShapelessRecipe(Key.get("black_dye_charcoal"), new ItemStack(Material.BLACK_DYE));
        recipe.addIngredient(Material.CHARCOAL);
        addRecipe(recipe);
    }
}
