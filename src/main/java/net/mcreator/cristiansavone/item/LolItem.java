
package net.mcreator.cristiansavone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.cristiansavone.CristiansavoneModElements;

@CristiansavoneModElements.ModElement.Tag
public class LolItem extends CristiansavoneModElements.ModElement {
	@ObjectHolder("cristiansavone:lol")
	public static final Item block = null;

	public LolItem(CristiansavoneModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("lol");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
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
			return 500F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}
	}
}
