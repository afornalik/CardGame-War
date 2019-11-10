package entity;

import view.View;

import java.util.Map;

public abstract class Game<T extends Turn> {

    private final View view;
    private final Player[] players;
    private Map<Integer, T > gameProgress;

    protected Game(View view, Player[] players) {
        this.view = view;
        this.players = players;
    }


}
