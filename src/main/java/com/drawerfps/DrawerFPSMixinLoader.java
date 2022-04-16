package com.drawerfps;

import java.util.ArrayList;
import java.util.List;

import zone.rong.mixinbooter.ILateMixinLoader;

public class DrawerFPSMixinLoader implements ILateMixinLoader
{
    @Override
    public List<String> getMixinConfigs()
    {
        List<String> mixins = new ArrayList<>();
        mixins.add("drawerfps.mixins.json");
        return mixins;
    }
}