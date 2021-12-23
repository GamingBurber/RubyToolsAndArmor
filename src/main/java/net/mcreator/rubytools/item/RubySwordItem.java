
package net.mcreator.rubytools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubytools.itemgroup.RubyToolsItemGroup;
import net.mcreator.rubytools.RubyToolsModElements;

@RubyToolsModElements.ModElement.Tag
public class RubySwordItem extends RubyToolsModElements.ModElement {
	@ObjectHolder("ruby_tools:ruby_sword")
	public static final Item block = null;
	public RubySwordItem(RubyToolsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyCrystalItem.block));
			}
		}, 3, -2f, new Item.Properties().group(RubyToolsItemGroup.tab)) {
		}.setRegistryName("ruby_sword"));
	}
}
