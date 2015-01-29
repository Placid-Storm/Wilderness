package com.wilderness.blocks;

import com.wilderness.creativetabs.ModCreativeTabs;
import com.wilderness.main.lib.RefStrings;
import com.wilderness.tileentity.TileEntityCrudeFence;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CrudeFence extends BlockContainer {
	
	public CrudeFence(Material fence){
		super (fence);
		this.setBlockName("CrudeFence");
		this.setCreativeTab(ModCreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID + "CrudeFence");
		//this.setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 1.6F, 0.8F);
	}

	@Override
	public TileEntity createNewTileEntity(World w, int i) {
		return new TileEntityCrudeFence();
	}
	@Override
	public int getRenderType(){
		return -2;
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
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemstack){
        int rotation = MathHelper.floor_double((double)(entityliving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        	//South
        	if (rotation == 0){
        		world.setBlockMetadataWithNotify(x, y, z, 2, 2);}
        	//West
        	if (rotation == 1){
        		world.setBlockMetadataWithNotify(x, y, z, 5, 2);}
        	//North
        	if (rotation == 2){
        		world.setBlockMetadataWithNotify(x, y, z, 3, 2);}
        	//East
        	if (rotation == 3){
        		world.setBlockMetadataWithNotify(x, y, z, 4, 2);}
    }
    public void setBlockBoundsBasedOnState(IBlockAccess world,int x,int y,int z){
    	int meta = world.getBlockMetadata(x, y, z);
    		//South
    		if(meta==2){
    			setBlockBounds(0.0F, 0.0F, 0.2F, 1.0F, 1.6F, 0.7F);}
    		//West
    		if(meta==5){
    			setBlockBounds(0.3F, 0.0F, 0.0F, 0.8F, 1.6F, 1.0F);}
    		//North
    		if(meta==3){
    			setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 1.6F, 0.8F);}
    		//East
    		if(meta==4){
    			setBlockBounds(0.2F, 0.0F, 0.0F, 0.7F, 1.6F, 1.0F);}
    }
}