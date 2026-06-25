package com.aimassist.addon;

import com.aimassist.addon.modules.AimAssist;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

public class AimAssistAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("AimAssist addon yükleniyor...");

        Modules.get().add(new AimAssist());
    }

    @Override
    public String getPackage() {
        return "com.aimassist.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("battlejesus", "meteor-aimassist-addon");
    }
}