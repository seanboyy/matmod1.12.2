package io.github.seanboyy.matmod.init;

import java.util.ArrayList;

import io.github.seanboyy.matmod.Reference;
import io.github.seanboyy.matmod.init.items.Custom;
import io.github.seanboyy.matmod.init.items.Rod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	
	public static ArrayList<Item> modItems = new ArrayList<Item>();
	public static Item upgradedDiamondPickaxe;
	public static Item upgradedDiamondAxe;
	public static Item upgradedDiamondHoe;
	public static Item upgradedDiamondShovel;
	public static Item upgradedDiamondSword;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldShovel;
	public static Item emeraldSword;
	public static Item obsidianPickaxe;
	public static Item obsidianAxe;
	public static Item obsidianHoe;
	public static Item obsidianShovel;
	public static Item obsidianSword;
	public static Item hybridPickaxe;
	public static Item hybridAxe;
	public static Item hybridHoe;
	public static Item hybridShovel;
	public static Item hybridSword;
	public static Item upgradedDiamond;
	public static Item hybridMix;
	public static Item hybridIngot;
	public static Item ironRod;
	public static Item diamondRod;
	public static Item obsidianRod;
	public static Item obsidianIngot;
	public static Item upgradedDiamondHelmet;
	public static Item upgradedDiamondChestplate;
	public static Item upgradedDiamondLeggings;
	public static Item upgradedDiamondBoots;
	public static Item emeraldHelmet;
	public static Item emeraldChestplate;
	public static Item emeraldLeggings;
	public static Item emeraldBoots;
	public static Item obsidianHelmet;
	public static Item obsidianChestplate;
	public static Item obsidianLeggings;
	public static Item obsidianBoots;
	public static Item hybridHelmet;
	public static Item hybridChestplate;
	public static Item hybridLeggings;
	public static Item hybridBoots;
	
	private static void fillList() {
		modItems.add(upgradedDiamondPickaxe);
		modItems.add(upgradedDiamondAxe);
		modItems.add(upgradedDiamondHoe);
		modItems.add(upgradedDiamondShovel);
		modItems.add(upgradedDiamondSword);
		modItems.add(emeraldPickaxe);
		modItems.add(emeraldAxe);
		modItems.add(emeraldHoe);
		modItems.add(emeraldShovel);
		modItems.add(emeraldSword);
		modItems.add(obsidianPickaxe);
		modItems.add(obsidianAxe);
		modItems.add(obsidianHoe);
		modItems.add(obsidianShovel);
		modItems.add(obsidianSword);
		modItems.add(hybridPickaxe);
		modItems.add(hybridAxe);
		modItems.add(hybridHoe);
		modItems.add(hybridShovel);
		modItems.add(hybridSword);
		modItems.add(upgradedDiamond);
		modItems.add(hybridMix);
		modItems.add(hybridIngot);
		modItems.add(ironRod);
		modItems.add(diamondRod);
		modItems.add(obsidianRod);
		modItems.add(obsidianIngot);
		modItems.add(upgradedDiamondHelmet);
		modItems.add(upgradedDiamondChestplate);
		modItems.add(upgradedDiamondLeggings);
		modItems.add(upgradedDiamondBoots);
		modItems.add(emeraldHelmet);
		modItems.add(emeraldChestplate);
		modItems.add(emeraldLeggings);
		modItems.add(emeraldBoots);
		modItems.add(obsidianHelmet);
		modItems.add(obsidianChestplate);
		modItems.add(obsidianLeggings);
		modItems.add(obsidianBoots);
		modItems.add(hybridHelmet);
		modItems.add(hybridChestplate);
		modItems.add(hybridLeggings);
		modItems.add(hybridBoots);
	}
	
	public static void init() {
		fillList();
		diamondRod = new Rod("diamond_rod");
		ironRod = new Rod("iron_rod");
		obsidianRod = new Rod("obsidian_rod");
		upgradedDiamond = new Custom("upgraded_diamond");
		obsidianIngot = new Custom("obsidian_ingot");
		hybridMix = new Custom("hybrid_mix");
		hybridIngot = new Custom("hybrid_ingot");
	}
	
	public static void register() {
		for(Item a : modItems) {
			registerItem(a);
		}
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
