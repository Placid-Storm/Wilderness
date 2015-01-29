package com.wilderness.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModMaterial {
	
	public static void mainRegistry(){
		
	}
	
	public static Item Steel_Ingot;
	
	public static void initializeMaterials(){
		Steel_Ingot = new Steel_Ingot();
	}
	public static void registerMaterials(){
		GameRegistry.registerItem(Steel_Ingot, Steel_Ingot.getUnlocalizedName());
	}
}
