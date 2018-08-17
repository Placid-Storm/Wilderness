package com.wilderness.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModItems {
	public static void mainRegistry(){
		initializeItems();
		registerItems();
	}
	
	public static Item Sinew;
	
	public static Item BowShaft;
	
	public static Item SurvivalKnife;
	
	public static Item SurvivalBlade;
	
	public static void initializeItems(){
		Sinew = new Sinew();
		BowShaft = new BowShaft(Material.wood);
		SurvivalKnife= new SurvivalKnife(Material.iron);
		SurvivalBlade = new SurvivalBlade(Material.iron);
		
	}
	public static void registerItems(){
		GameRegistry.registerItem(Sinew, Sinew.getUnlocalizedName());
		GameRegistry.registerItem(BowShaft, BowShaft.getUnlocalizedName());
		GameRegistry.registerItem(SurvivalKnife, SurvivalKnife.getUnlocalizedName());
		GameRegistry.registerItem(SurvivalBlade, SurvivalBlade.getUnlocalizedName());
	}
}
