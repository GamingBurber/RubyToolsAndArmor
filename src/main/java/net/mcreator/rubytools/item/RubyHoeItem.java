
package net.mcreator.rubytools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.rubytools.itemgroup.RubyToolsItemGroup;
import net.mcreator.rubytools.RubyToolsModElements;

@RubyToolsModElements.ModElement.Tag
public class RubyHoeItem extends RubyToolsModElements.ModElement {
	@ObjectHolder("ruby_tools:ruby_hoe")
	public static final Item block = null;
	public RubyHoeItem(RubyToolsModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -1.9f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -2f, new Item.Properties().group(RubyToolsItemGroup.tab)) {
		}.setRegistryName("ruby_hoe"));
	}
}
