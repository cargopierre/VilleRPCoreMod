package net.mcreator.villerpcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.villerpcore.item.ItemWeedSeed;
import net.mcreator.villerpcore.item.ItemWeed;
import net.mcreator.villerpcore.item.ItemSecateur;
import net.mcreator.villerpcore.block.BlockWeedstage0;
import net.mcreator.villerpcore.ElementsVilleRPCore;

@ElementsVilleRPCore.ModElement.Tag
public class ProcedureWeedstage5OnBlockRightClicked extends ElementsVilleRPCore.ModElement {
	public ProcedureWeedstage5OnBlockRightClicked(ElementsVilleRPCore instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Weedstage5OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Weedstage5OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Weedstage5OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Weedstage5OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Weedstage5OnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemSecateur.block, (int) (1)).getItem())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWeed.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if ((Math.random() < 0.5)) {
				if ((Math.random() < 0.2)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWeedSeed.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockWeedstage0.block.getDefaultState(), 3);
				if ((Math.random() < 0.5)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWeed.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockWeedstage0.block.getDefaultState(), 3);
				if ((Math.random() < 0.5)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWeed.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
