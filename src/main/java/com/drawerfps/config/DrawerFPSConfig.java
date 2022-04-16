package com.drawerfps.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.drawerfps.DrawerFPS;

@Config(modid = DrawerFPS.MODID, name = "DrawerFPS")
public class DrawerFPSConfig
{
    @Config.Name("Render Range")
    @Config.Comment("Range at which drawers should render their items. Default = 10 blocks")
    public static int renderRange = 10;

    @Mod.EventBusSubscriber(modid = DrawerFPS.MODID)
    public static class EventHandler
    {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event)
        {
            if (event.getModID().equals(DrawerFPS.MODID))
            {
                ConfigManager.sync(DrawerFPS.MODID, Config.Type.INSTANCE);
            }
        }
    }
}