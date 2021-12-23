
package net.mcreator.rubytools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.rubytools.itemgroup.RubyToolsItemGroup;
import net.mcreator.rubytools.RubyToolsModElements;

@RubyToolsModElements.ModElement.Tag
public class RubyCrystalItem extends RubyToolsModElements.ModElement {
	@ObjectHolder("ruby_tools:ruby_crystal")
	public static final Item block = null;
	public RubyCrystalItem(RubyToolsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RubyToolsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("ruby_crystal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
