package net.mcreator.cristiansavone.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cristiansavone.item.LolItem;
import net.mcreator.cristiansavone.CristiansavoneMod;

import java.util.Map;

public class GivemelolCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CristiansavoneMod.LOGGER.warn("Failed to load dependency entity for procedure GivemelolCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(LolItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
