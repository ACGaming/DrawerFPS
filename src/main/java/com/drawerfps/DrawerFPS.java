package com.drawerfps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DrawerFPS.MODID, name = DrawerFPS.NAME, version = DrawerFPS.VERSION, acceptedMinecraftVersions = "[1.12.2]", dependencies = "required-after:mixinbooter", clientSideOnly = true)
public class DrawerFPS
{
    public static final String MODID = "drawerfps";
    public static final String NAME = "DrawerFPS";
    public static final String VERSION = "1.12.2-1.0.0";
    public static final Logger LOGGER = LogManager.getLogger();

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("DrawerFPS initialized");
    }
}