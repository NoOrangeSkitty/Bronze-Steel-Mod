
package net.mcreator.bronzesteel.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.bronzesteel.init.BronzeSteelModItems;

public class BronzeAxeItem extends AxeItem {
	public BronzeAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 238;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
		}, 1, -3.1f, new Item.Properties());
	}
}
