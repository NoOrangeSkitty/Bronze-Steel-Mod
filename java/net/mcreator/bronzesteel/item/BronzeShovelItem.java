
package net.mcreator.bronzesteel.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bronzesteel.init.BronzeSteelModItems;

public class BronzeShovelItem extends ShovelItem {
	public BronzeShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 238;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BronzeSteelModItems.BRONZE_INGOT_BS.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
