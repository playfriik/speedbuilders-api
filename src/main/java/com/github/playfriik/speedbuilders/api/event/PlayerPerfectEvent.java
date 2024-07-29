package com.github.playfriik.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerPerfectEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final float time;

    public PlayerPerfectEvent(Player player, float time) {
        this.player = player;
        this.time = time;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public @NotNull Player getPlayer() {
        return player;
    }

    public float getTime() {
        return time;
    }
}
