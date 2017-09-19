package io.github.seanboyy.matmod.items;

import net.minecraft.item.ItemTool;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class ItemModAxe extends ItemTool{
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
	
	public ItemModAxe(String name, ToolMaterial material, float damage, float speed) {
		super(damage, speed, material, EFFECTIVE_ON);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
