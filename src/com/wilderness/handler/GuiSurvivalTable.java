package com.wilderness.handler;

import com.wilderness.main.lib.RefStrings;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiSurvivalTable extends GuiScreen{
	
    private int x, y, z;
    private EntityPlayer player;
    private World world;
    private int xSize, ySize;
    private ResourceLocation backgroundimage = new ResourceLocation(RefStrings.MODID.toLowerCase() + ":" + "textures/gui/survivalist_table.png");
    
    public GuiSurvivalTable(EntityPlayer player, World world, int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.player = player;
        this.world = world;
        xSize = 176;
        ySize = 214;
    }
    @Override
    public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
        this.mc.getTextureManager().bindTexture(backgroundimage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize,  ySize);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}