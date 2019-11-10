package entity.game;

import entity.Player;

public abstract class Game {

    private final Player[] players;

    protected Game(Player[] players) {
        this.players = players;
    }
}
