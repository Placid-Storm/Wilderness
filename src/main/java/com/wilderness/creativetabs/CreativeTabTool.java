package com.wilderness.creativetabs;

import com.wilderness.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTool extends CreativeTabs {

	public CreativeTabTool(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// getItemFromBlock isn't required because this is an Item.
		return Item.getItemFromBlock(ModBlocks.TikiTorch);
	}

}
