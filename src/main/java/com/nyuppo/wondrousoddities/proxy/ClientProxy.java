package com.nyuppo.wondrousoddities.proxy;

import com.nyuppo.wondrousoddities.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	public void reigsterItemRenderer(Item item, int meta, String id) {

		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id, "inventory"));

	}

}
