package utils.turn;

import entity.Player;
import entity.Skirmish;
import entity.Turn;
import service.skirmish.ISkirmishStandardService;
import utils.skirmish.SkirmishStandard;



public class TurnStandard extends Turn {


    public TurnStandard(Player[] playersBeforeTurn, ISkirmishStandardService iSkirmishStandardService) {
        super(iSkirmishStandardService, playersBeforeTurn);
    }

    @Override
    public void doTurn() {
        Skirmish[] skirmishes = new Skirmish[getPlayersBeforeTurn().length];
        for (int i = 0; i < getPlayersBeforeTurn().length; i++) {
            skirmishes[i] = new SkirmishStandard(
                    super.getPlayersBeforeTurn()[i]
                            .getPlayerDeckInHand()
                            .takeCard()
                    , super.getPlayersBeforeTurn()[i]);
        }

        Skirmish skirmish = super.getiSkirmishStandardService().receiveWinner(skirmishes);
        super.setWinner(skirmish.getPlayer());

    }
}
