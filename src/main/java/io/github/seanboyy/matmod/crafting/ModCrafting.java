package io.github.seanboyy.matmod.crafting;

import io.github.seanboyy.matmod.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting(){
		GameRegistry.addSmelting(Blocks.DIAMOND_BLOCK, new ItemStack(ModItems.upgradedDiamond, 6), 1.0F);
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:iron_rod"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.ironRod), new Object[] {"#", "#", '#', Items.IRON_INGOT});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:diamond_rod"), new ResourceLocation("matmod_items"), new ItemStack(ModItems.diamondRod), new Object[] {"#", "#", '#', Items.DIAMOND});
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidianIngot),1.0F);
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_rod"), new ResourceLocation("matmod_items"), new ItemStack(ModItems.obsidianRod),new Object[] {"#", "#", '#', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondAxe), new Object[] {"##", "#X", " X", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondAxe), new Object[] {"##", "X#", "X ", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondHoe), new Object[] {"##", " X", " X", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondHoe), new Object[] {"##", "X ", "X ", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_pickaxe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondPickaxe), new Object[] {"###", " X ", " X ", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_shovel"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondShovel), new Object[] {"#", "X", "X", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_sword"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondSword), new Object[] {"#", "#", "X", '#', ModItems.upgradedDiamond, 'X', ModItems.ironRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldAxe), new Object[] {"#@", "#X", " X", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldAxe), new Object[] {"@#", "X#", "X ", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldHoe), new Object[] {"@#", " X", " X", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldHoe), new Object[] {"#@", "X ", "X ", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_pickaxe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldPickaxe), new Object[] {"#@#", " X ", " X ", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_shovel"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldShovel), new Object[] {"#", "X", "X", '#', Items.EMERALD, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_sword"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldSword), new Object[] {"#", "@", "X", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianAxe), new Object[] {"##", "#X", " X", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianAxe), new Object[] {"##", "X#", "X ", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianHoe), new Object[] {"##", " X", " X", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianHoe), new Object[] {"##", "X ", "X ", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_pickaxe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianPickaxe), new Object[] {"###", " X ", " X ", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_shovel"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianShovel), new Object[] {"#", "X", "X", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_sword"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianSword), new Object[] {"#", "#", "X", '#', ModItems.obsidianIngot, 'X', ModItems.diamondRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_mix"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridMix, 2), new Object[] {"@#@", "$N$", "@#@", '@', ModItems.upgradedDiamond, '#', ModItems.obsidianIngot, '$', Items.EMERALD, 'N', Blocks.DIAMOND_BLOCK});
		GameRegistry.addSmelting(ModItems.hybridMix, new ItemStack(ModItems.hybridIngot), 3.0F);
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridAxe), new Object[] {"##", "#X", " X", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_axe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridAxe), new Object[] {"##", "X#", "X ", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridHoe), new Object[] {"##", " X", " X", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_hoe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridHoe), new Object[] {"##", "X ", "X ", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_pickaxe"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridPickaxe), new Object[] {"###", " X ", " X ", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_shovel"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridShovel), new Object[] {"#", "X", "X", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_sword"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridSword), new Object[] {"#", "#", "X", '#', ModItems.hybridIngot, 'X', ModItems.obsidianRod});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_helmet"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondHelmet), new Object[] {"###", "# #", '#', ModItems.upgradedDiamond});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_chestplate"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondChestplate), new Object[] {"# #", "###", "###", '#', ModItems.upgradedDiamond});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_leggings"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondLeggings), new Object[] {"###", "# #", "# #", '#', ModItems.upgradedDiamond});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:upgraded_diamond_boots"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.upgradedDiamondBoots), new Object[] {"# #", "# #", '#', ModItems.upgradedDiamond});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_helmet"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldHelmet), new Object[] {"#@#", "# #", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_chestplate"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldChestplate), new Object[] {"# #", "#@#", "#@#", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_leggings"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldLeggings), new Object[] {"#@#", "# #", "# #", '#', Items.EMERALD, '@', Blocks.EMERALD_BLOCK});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:emerald_boots"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.emeraldBoots), new Object[] {"# #", "# #", '#', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_helmet"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianHelmet), new Object[] {"###", "# #", '#', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_chestplate"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianChestplate), new Object[] {"# #", "###", "###", '#', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_leggings"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianLeggings), new Object[] {"###", "# #", "# #", '#', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:obsidian_boots"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.obsidianBoots), new Object[] {"# #", "# #", '#', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_helmet"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridHelmet), new Object[] {"###", "# #", '#', ModItems.hybridIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_chestplate"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridChestplate), new Object[] {"# #", "###", "###", '#', ModItems.hybridIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_leggings"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridLeggings), new Object[] {"###", "# #", "# #", '#', ModItems.hybridIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("matmod:hybrid_boots"), new ResourceLocation("matmod:matmod_items"), new ItemStack(ModItems.hybridBoots), new Object[] {"# #", "# #", '#', ModItems.hybridIngot});
	}
}
