package com.wilderness.main;

import com.wilderness.tileentity.TileEntityCrudeFence;
import com.wilderness.tileentity.TileEntityTikiTorch;
import com.wilderness.tileentity.TileEntityTorchSet;
import com.wilderness.world.ModWorld;
import com.wilderness.blocks.ModBlocks;
import com.wilderness.creativetabs.ModCreativeTabs;
import com.wilderness.entity.RegisterEntities;
import com.wilderness.handler.GuiHandler;
import com.wilderness.handler.ModEventHandler;
import com.wilderness.items.ModItems;
import com.wilderness.main.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)

public class MainRegistry {
	
	@Mod.Instance(RefStrings.MODID)
		public static MainRegistry instance;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent PreEvent){
	//Pre-Initialization event handler.
		ModEventHandler.mainRegistry();
		ModCreativeTabs.initializeTabs();
		ModBlocks.mainRegistry();
		ModItems.mainRegistry();
		ModWorld.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
		
	}
	@EventHandler
	public static void Init(FMLInitializationEvent Event){
	//Initialization event handler.
		proxy.registerRenderThings();
		proxy.registerRenderEntities();
		RegisterEntities.mainRegistry();
		GameRegistry.registerTileEntity(TileEntityTikiTorch.class, "TileEntityTikiTorch");
		GameRegistry.registerTileEntity(TileEntityCrudeFence.class, "TileEntityCrudeFence");
		GameRegistry.registerTileEntity(TileEntityTorchSet.class, "TileEntityTorchSet");		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent PostEvent){
	//Post-Initialization event handler.
		
	}
}