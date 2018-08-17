package com.wilderness.entity;

import com.wilderness.main.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSurvivalist extends RenderLiving {
	
	private static final ResourceLocation Survivalist = new ResourceLocation(RefStrings.MODID + ":textures/entities/ModelSurvivalist.png");

	public RenderSurvivalist(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(Entity var1) {
		
		return Survivalist;
	}

}
