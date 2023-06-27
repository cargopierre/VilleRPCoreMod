package net.mcreator.villerpcore.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.villerpcore.ElementsVilleRPCore;

@ElementsVilleRPCore.ModElement.Tag
public class ProcedureJoinFoodEaten extends ElementsVilleRPCore.ModElement {
	public ProcedureJoinFoodEaten(ElementsVilleRPCore instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JoinFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.8)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 6000, (int) 0, (false), (false)));
		} else if ((Math.random() < 0.25)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 6000, (int) 1, (false), (false)));
		}
		if ((Math.random() < 0.05)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 1200, (int) 0, (false), (false)));
		}
		if ((Math.random() < 0.65)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 6000, (int) 2, (false), (false)));
		} else if ((Math.random() < 0.65)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, (int) 6000, (int) 0, (false), (false)));
		}
		if ((Math.random() < 0.5)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 6000, (int) 0, (false), (false)));
		} else if ((Math.random() < 0.7)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 6000, (int) 2, (false), (false)));
		}
		if ((Math.random() < 0.7)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 6000, (int) 2, (false), (false)));
		} else if ((Math.random() < 0.15)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 3500, (int) 2, (false), (false)));
		}
	}
}
