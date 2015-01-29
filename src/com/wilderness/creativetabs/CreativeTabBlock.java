package com.wilderness.creativetabs;

import com.wilderness.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs {

	public CreativeTabBlock(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		//Must use getItemFromBlock because we are using a block.
		return Item.getItemFromBlock(ModBlocks.TikiTorch);
	}

}
