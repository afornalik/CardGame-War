package entity;


import java.util.Map;

public abstract class Game {


    private final Player[] players;

    private Map<Integer, Turn> gameProgress;

    protected Game(Player[] players) {

        this.players = players;
    }


    public Player[] getPlayers() {
        return players;
    }

    public Map<Integer, Turn> getGameProgress() {
        return gameProgress;
    }

    public void setGameProgress(Map<Integer, Turn> gameProgress) {
        this.gameProgress = gameProgress;
    }
}
