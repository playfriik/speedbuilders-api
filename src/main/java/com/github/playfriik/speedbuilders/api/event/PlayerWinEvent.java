package com.github.playfriik.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerWinEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;

    public PlayerWinEvent(Player player) {
        this.player = player;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public @NotNull Player getPlayer() {
        return player;
    }
}
