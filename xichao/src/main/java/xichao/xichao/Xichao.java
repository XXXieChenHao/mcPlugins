package xichao.xichao;

import org.bukkit.plugin.java.JavaPlugin;
import xichao.xichao.events.leaveBed;

public final class Xichao extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("汐潮服务器插件启动");

        getServer().getPluginManager().registerEvents(new leaveBed(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("汐潮服务器插件停止");
    }
}
