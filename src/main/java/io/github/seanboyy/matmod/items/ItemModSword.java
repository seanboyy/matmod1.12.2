package io.github.seanboyy.matmod.items;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword {

	public ItemModSword(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
