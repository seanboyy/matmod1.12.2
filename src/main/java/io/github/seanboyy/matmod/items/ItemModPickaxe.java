package io.github.seanboyy.matmod.items;

import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
