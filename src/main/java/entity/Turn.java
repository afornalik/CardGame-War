package entity;

import service.skirmish.ISkirmishStandardService;
import service.turn.ITurnProgressService;

public abstract class Turn implements ITurnProgressService {

    private final ISkirmishStandardService iSkirmishStandardService;
    private final Player[] playersBeforeTurn;
    private Player winner;

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

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }


}
