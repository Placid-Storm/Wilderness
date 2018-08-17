package com.wilderness.main;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.wilderness.tileentity.TileEntityCrudeFence;
import com.wilderness.tileentity.TileEntityTikiTorch;
import com.wilderness.tileentity.TileEntityTorchSet;
import com.wilderness.entity.ModelSurvivalist;
import com.wilderness.entity.RenderSurvivalist;
import com.wilderness.entity.SurvivalistEntity;
import com.wilderness.renderer.RenderCrudeFence;
import com.wilderness.renderer.RenderTikiTorch;
import com.wilderness.renderer.RenderTorchSet;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		
	}
	public void registerRenderThings(){
		//Tiki Torch
		TileEntitySpecialRenderer renderTikiTorch = new RenderTikiTorch();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTikiTorch.class, renderTikiTorch);
		//Crude Fence
		TileEntitySpecialRenderer renderCrudeFence = new RenderCrudeFence();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrudeFence.class, renderCrudeFence);
		//Torch Set
		TileEntitySpecialRenderer renderTorchSet = new RenderTorchSet();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTorchSet.class, renderTorchSet);
	}
	public void registerRenderEntities(){
		RenderingRegistry.registerEntityRenderingHandler(SurvivalistEntity.class, new RenderSurvivalist (new ModelSurvivalist(), 0.5F));
		
	}
	public void registerTileEntitieSpecialRenderer(){
		
	}
}
