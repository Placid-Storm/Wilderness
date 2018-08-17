package com.wilderness.blocks;

import java.util.Random;

import com.wilderness.tileentity.TileEntityTorchSet;
import com.wilderness.creativetabs.ModCreativeTabs;
import com.wilderness.main.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TorchSet extends BlockContainer {

	public TorchSet(Material material) {
		super(material);
		this.setBlockName("TorchSet");
		this.setCreativeTab(ModCreativeTabs.tabTools);
		this.setBlockTextureName(RefStrings.MODID + ":TorchSet");
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 2.2F, 0.9F);
		this.setTickRandomly(true);
	}
	//Make sure you set this as your TileEntity class relevant for the block!
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTorchSet();
	}
	//You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType(){
		return -3;
	}
	//It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	//It's not a normal block, so you need this too.
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
    //This is the icon to use for showing the block in your hand.
    public void registerIcons(IIconRegister icon) {
            this.blockIcon = icon.registerIcon("");
    }
    //A randomly called display update to be able to add particles or other items for display.
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World W, int Z, int Y, int X, Random R)
    {
        double d0 = (double)((float)Z + 0.775F);
        double d1 = (double)((float)Y + 2.2F);
        double d2 = (double)((float)X + 0.8F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;

            W.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            W.spawnParticle("flame", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            	this.setLightLevel(1.0F);

        double e0 = (double)((float)Z + 0.55F);
        double e1 = (double)((float)Y + 2.2F);
        double e2 = (double)((float)X + 0.4F);
        double e3 = 0.2199999988079071D;
        double e4 = 0.27000001072883606D;

            W.spawnParticle("smoke", e0 - e4, e1 + e3, e2, 0.0D, 0.0D, 0.0D);
            W.spawnParticle("flame", e0 - e4, e1 + e3, e2, 0.0D, 0.0D, 0.0D);
            	this.setLightLevel(1.0F);
    
        double f0 = (double)((float)Z + 0.95F);
        double f1 = (double)((float)Y + 2.2F);
        double f2 = (double)((float)X + 0.4F);
        double f3 = 0.2199999988079071D;
        double f4 = 0.27000001072883606D;

            W.spawnParticle("smoke", f0 - f4, f1 + f3, f2, 0.0D, 0.0D, 0.0D);
            W.spawnParticle("flame", f0 - f4, f1 + f3, f2, 0.0D, 0.0D, 0.0D);
            	this.setLightLevel(1.0F);
    }
}
//BlockTorch
