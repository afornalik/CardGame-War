package entity;

import service.turn.ITurnProgressService;

public abstract class Turn implements ITurnProgressService {

    private final Player[] playersBeforeTurn;
    private Player[] playersAfterTurn;

    protected Turn(Player[] playersBeforeTurn) {
        this.playersBeforeTurn = playersBeforeTurn;
    }

    public Player[] getPlayersBeforeTurn() {
        return playersBeforeTurn;
    }

    public Player[] getPlayersAfterTurn() {
        return playersAfterTurn;
    }

    public void setPlayersAfterTurn(Player[] playersAfterTurn) {
        this.playersAfterTurn = playersAfterTurn;
    }
}
