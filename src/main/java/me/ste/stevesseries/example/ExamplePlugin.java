package me.ste.stevesseries.example;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info("Hello, world!");

        this.getCommand("exampleplugin").setExecutor(new ExamplePluginCommand());
    }
}
