
package net.mcreator.rubytools.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rubytools.item.RubyCrystalItem;
import net.mcreator.rubytools.RubyToolsModElements;

@RubyToolsModElements.ModElement.Tag
public class RubyToolsItemGroup extends RubyToolsModElements.ModElement {
	public RubyToolsItemGroup(RubyToolsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabruby_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyCrystalItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
