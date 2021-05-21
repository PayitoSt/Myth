package payitost.auth;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import payitost.auth.listeners.Join;

import java.io.File;

public class Main extends JavaPlugin {


    public String rutaConfig;

    @Override
    public void onEnable(){
        registerEvents();
        registerCommands();
        registerConfig();
        System.out.println("[Auth] Cargado!");
    }

    @Override
    public void onDisable(){

    }

    public void registerEvents(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new Join(this), this);
    }

    public void registerCommands(){

    }

    public void registerConfig(){
        File config = new File(this.getDataFolder(),"config.yml");
        rutaConfig = config.getPath();
        if(!config.exists()){
            this.getConfig().options().copyDefaults(true);
            saveConfig();
        }
    }

}
