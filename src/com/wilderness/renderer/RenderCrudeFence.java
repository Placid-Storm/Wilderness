package com.wilderness.renderer;

import org.lwjgl.opengl.GL11;

import com.wilderness.blocks.CrudeFence;
import com.wilderness.blocks.ModelCrudeFence;
import com.wilderness.main.lib.RefStrings;
import com.wilderness.tileentity.TileEntityCrudeFence;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class RenderCrudeFence extends TileEntitySpecialRenderer {

	private final ModelCrudeFence model;
	
	private static final ResourceLocation textures = (new ResourceLocation(RefStrings.MODID + ":textures/blocks/ModelCrudeFence.png"));
	
	public RenderCrudeFence(){
		this.model = new ModelCrudeFence();
	}
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float scale) {
		TileEntityCrudeFence CrudeFenceTE = (TileEntityCrudeFence)tileentity;
		//Start Push Matrix.
		GL11.glPushMatrix();
		//Set the entity location.
		GL11.glTranslatef((float) d0 + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F);
		//rotate the entity so it isn't upside down.
		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
		int rotation = CrudeFenceTE.getBlockMetadata(
				);
				if (rotation == 2){
					scale = 90;}
				if (rotation == 3){
					scale = -90;}
				if (rotation == 4){
					scale = 0;}
				if (rotation == 5){
					scale = 180;}
		GL11.glRotatef((float)scale, 0.0F, 1.0F, 0.0F);
			//Bind the texture to the entity.
			Minecraft.getMinecraft().renderEngine.bindTexture(textures);
			//Reference the model again.
//			GL11.glPushMatrix();
			GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
//			GL11.glPopMatrix();
			this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			//Stop both Push Matrix
			GL11.glPopMatrix();
	}
	// Set the lighting stuff, so it changes it's brightness properly.
	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        Tessellator tesselator = Tessellator.instance;
        //float brightness = block.getLightValue(world, i, j, k);
        float brightness = block.getLightValue(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tesselator.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
	}
//	private void adjustRotationAngle(World world,int x, int y, int z) {
//        int meta = world.getBlockMetadata(x,y,z)&4;
//	}
}
