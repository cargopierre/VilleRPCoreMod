package net.mcreator.villerpcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.villerpcore.block.BlockWeedstage5;
import net.mcreator.villerpcore.ElementsVilleRPCore;

@ElementsVilleRPCore.ModElement.Tag
public class ProcedureStage4to5 extends ElementsVilleRPCore.ModElement {
	public ProcedureStage4to5(ElementsVilleRPCore instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Stage4to5!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Stage4to5!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Stage4to5!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Stage4to5!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockWeedstage5.block.getDefaultState(), 3);
	}
}
