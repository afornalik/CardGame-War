package entity;


import java.util.Map;

public abstract class Game<T extends Turn> {


    private final Player[] players;

    private Map<Integer, T> gameProgress;

    protected Game(Player[] players) {

        this.players = players;
    }


    public Player[] getPlayers() {
        return players;
    }

    public Map<Integer, T> getGameProgress() {
        return gameProgress;
    }

    public void setGameProgress(Map<Integer, T> gameProgress) {
        this.gameProgress = gameProgress;
    }
}
