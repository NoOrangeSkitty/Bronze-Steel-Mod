
package net.mcreator.bronzesteel.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SteelDustItem extends Item {
	public SteelDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}