package payitost.auth.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;
import payitost.auth.Main;

public class Join implements Listener {



    private Main plugin;
    public Join(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerMoveEvent e){
        Player p = e.getPlayer();
        p.setVelocity(new Vector().zero());

    }




}
