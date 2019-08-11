package com.jtrent238.luckyblock.proxy;

import com.jtrent238.luckyblock.Main;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Black;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Blue;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Brown;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Cyan;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Green;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Grey;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_LightBlue;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Lime;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Magenta;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Orange;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Pink;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Purple;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_Red;
import com.jtrent238.luckyblock.entity.EntityLivingLuckyBlock_White;
import com.jtrent238.luckyblock.model.ModelLivingLuckyBlock;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
  
    
	public void init(FMLInitializationEvent e) {
    super.init (e);
    
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Red.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Red.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_White.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_White.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Purple.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Purple.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Pink.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Pink.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Orange.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Orange.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Magenta.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Magenta.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Lime.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Lime.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_LightBlue.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_LightBlue.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Grey.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Grey.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Green.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Green.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Cyan.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Cyan.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Brown.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Brown.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Blue.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Blue.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLivingLuckyBlock_Black.class, new RenderLiving(new ModelLivingLuckyBlock(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Main.MODID + ":textures/entity/EntityLivingLuckyBlock_Black.png");}});

    VillagerRegistry.instance().registerVillagerSkin(29627, new ResourceLocation(Main.MODID, "textures/entity/LuckyTrader.png"));
	
	}

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
}