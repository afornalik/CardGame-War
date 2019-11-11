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

        for(int i = 0 ; i < getPlayersBeforeTurn().length; i++){
            if(skirmishes[i].getPlayer() == skirmish.getPlayer()){
                System.out.println(skirmish);
            }
        }

        //super.setPlayersAfterTurn();
        super.getPlayersAfterTurn();

    }



    @Override
    public Player showWinner() {
        return null;
    }
}
