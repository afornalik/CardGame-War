package entity;

import service.skirmish.ISkirmishStandardService;
import service.turn.ITurnProgressService;

public abstract class Turn implements ITurnProgressService {

    private final ISkirmishStandardService iSkirmishStandardService;
    private final Player[] playersBeforeTurn;
    private Player[] playersAfterTurn;

    protected Turn(ISkirmishStandardService iSkirmishStandardService, Player[] playersBeforeTurn) {
        this.iSkirmishStandardService = iSkirmishStandardService;
        this.playersBeforeTurn = playersBeforeTurn;

    }

    public ISkirmishStandardService getiSkirmishStandardService() {
        return iSkirmishStandardService;
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
