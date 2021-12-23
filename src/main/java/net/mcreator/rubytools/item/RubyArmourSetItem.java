
package net.mcreator.rubytools.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.rubytools.itemgroup.RubyToolsItemGroup;
import net.mcreator.rubytools.RubyToolsModElements;

@RubyToolsModElements.ModElement.Tag
public class RubyArmourSetItem extends RubyToolsModElements.ModElement {
	@ObjectHolder("ruby_tools:ruby_armour_set_helmet")
	public static final Item helmet = null;
	@ObjectHolder("ruby_tools:ruby_armour_set_chestplate")
	public static final Item body = null;
	@ObjectHolder("ruby_tools:ruby_armour_set_leggings")
	public static final Item legs = null;
	@ObjectHolder("ruby_tools:ruby_armour_set_boots")
	public static final Item boots = null;
	public RubyArmourSetItem(RubyToolsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{500, 500, 500, 500}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 30;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "ruby_armour_set";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		};
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(RubyToolsItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "ruby_tools:textures/models/armor/ruby_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("ruby_armour_set_helmet"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(RubyToolsItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "ruby_tools:textures/models/armor/ruby_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("ruby_armour_set_chestplate"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(RubyToolsItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "ruby_tools:textures/models/armor/ruby_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("ruby_armour_set_leggings"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(RubyToolsItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "ruby_tools:textures/models/armor/ruby_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("ruby_armour_set_boots"));
	}
}
