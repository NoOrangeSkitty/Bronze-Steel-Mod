
package net.mcreator.bronzesteel.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.bronzesteel.init.BronzeSteelModItems;

public class BronzeHoeItem extends HoeItem {
	public BronzeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 238;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 0, -1f, new Item.Properties());
	}
}
