package com.wilderness.main;

import com.wilderness.blocks.ModBlocks;
import com.wilderness.items.ModItems;
import com.wilderness.items.ModMaterial;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
	//Shaped Recipe
		//Materials
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.TikiTorch,1), new Object[]{
			"TTT",
			"SRS",
			"RRR",
			'T', Blocks.torch,'S', Items.string,'R', Items.reeds});
	//Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SurvivalKnife,1),new ItemStack(Items.leather), new ItemStack(ModItems.SurvivalBlade));
		GameRegistry.addShapelessRecipe(new ItemStack(ModMaterial.Steel_Ingot,8),(Items.coal),(Items.iron_ingot));
	}
	public static void addSmeltingRec(){
		//Smelting Recipe
		//GameRegistry.addSmelting(Blocks.coal_block,new ItemStack(Items.diamond,1),20.0f);
		
	}
}
