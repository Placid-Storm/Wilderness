package com.wilderness.blocks;

import com.wilderness.main.lib.RefStrings;
import com.wilderness.creativetabs.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	public static Block TikiTorch;
	
	public static Block CrudeFence;
	
	public static Block TorchSet;
	
	public static Block SurvivalTable;
	
	public static void initializeBlock(){
		TikiTorch = new TikiTorch(Material.wood);
		CrudeFence = new CrudeFence(Material.wood);
		TorchSet = new TorchSet(Material.wood);
		SurvivalTable = new SurvivalTable();
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(TikiTorch, TikiTorch.getUnlocalizedName());
		GameRegistry.registerBlock(CrudeFence, CrudeFence.getUnlocalizedName());
		GameRegistry.registerBlock(TorchSet, TorchSet.getUnlocalizedName());
		GameRegistry.registerBlock(SurvivalTable, SurvivalTable.getUnlocalizedName());
	}
}
