package io.github.seanboyy.matmod.init.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Armor extends ItemArmor {

	public Armor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot) {
		super(material, renderIndex, slot);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
