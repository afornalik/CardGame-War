package entity.game;

import entity.Player;
import entity.turn.Turn;

import java.util.Map;

public abstract class Game<T extends Turn> {

    private final Player[] players;
    private Map<Integer, T > gameProgress;

    protected Game(Player[] players) {
        this.players = players;
    }


}
