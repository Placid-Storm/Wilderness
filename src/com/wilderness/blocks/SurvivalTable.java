package com.wilderness.blocks;

import com.wilderness.creativetabs.ModCreativeTabs;
import com.wilderness.handler.ModEventHandler;
import com.wilderness.main.MainRegistry;
import com.wilderness.main.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class SurvivalTable extends Block {
	
	private IIcon [] Sides = new IIcon[6];

	protected SurvivalTable() {
		super(Material.wood);
		setBlockName("SurvivalTable");
		setCreativeTab(ModCreativeTabs.tabBlock);
	}
	@Override
	public void registerBlockIcons(IIconRegister IconRegister){
		for (int i = 0; i < Sides.length; i++){
			Sides[i] = IconRegister.registerIcon(RefStrings.MODID + ":" + "Survivalist_Table_" + i);
			
		}
	}
	@Override
	public IIcon getIcon(int side, int meta){
		return Sides[side];
	}
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ){
		if (world.isRemote){
			if (world.getTileEntity(x, y, z) != null)
				player.openGui(MainRegistry.instance, GUIs.SurvivalTable.ordinal(),world,x,y,z);
			return true;
		}
		return true;
	}
}
