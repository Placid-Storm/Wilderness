package com.wilderness.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class RegisterEntities extends EntityList{

	public static void mainRegistry(){
		RegisterEntity(SurvivalistEntity.class, "Survivalist", 0x41533B, 0x594739);
		addSpawn(SurvivalistEntity.class, 0, 0, 0, null);
	}

	private static void RegisterEntity(Class<SurvivalistEntity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));}
	public static void addSpawn(Class<SurvivalistEntity> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes){
			if (spawnProb > 0){
				EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
			}
		
	}

}