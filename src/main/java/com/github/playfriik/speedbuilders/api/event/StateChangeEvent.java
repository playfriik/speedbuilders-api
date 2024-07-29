package com.github.playfriik.speedbuilders.api.event;

import com.github.playfriik.speedbuilders.api.game.State;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StateChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final State state;
    private final List<Player> players;

    public StateChangeEvent(State state, List<Player> players) {
        this.state = state;
        this.players = players;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public @NotNull State getState() {
        return state;
    }

    public @NotNull List<Player> getPlayers() {
        return players;
    }
}
