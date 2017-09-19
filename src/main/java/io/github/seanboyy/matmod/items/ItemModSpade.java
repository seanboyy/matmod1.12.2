package io.github.seanboyy.matmod.items;

import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade{

	public ItemModSpade(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
