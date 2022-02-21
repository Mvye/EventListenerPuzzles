package com.mvye.eventlistenerpuzzles.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PuzzleEvents implements Listener {

        @EventHandler
        public static void onTntPlaced(BlockPlaceEvent event) {
            Material block = event.getBlock().getType();
            Player player = event.getPlayer();

            if (block == Material.TNT) {
                player.sendMessage(ChatColor.RED + "TNT is disabled in this server!");
                event.setCancelled(true); // cancels the block place
            }
        }

        @EventHandler
        public static void onPlayerSprint(PlayerToggleSprintEvent event) {
            boolean isPlayerSprinting = event.isSprinting();
            Player player = event.getPlayer();
            if (isPlayerSprinting) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10000000, 1));
            }
            else {
                player.removePotionEffect(PotionEffectType.SPEED);
            }
        }
}
