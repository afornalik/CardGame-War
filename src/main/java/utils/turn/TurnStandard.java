package utils.turn;

import entity.Player;
import entity.Skirmish;
import entity.Turn;
import utils.skirmish.SkirmishStandard;

import java.util.Arrays;
import java.util.Comparator;

public class TurnStandard extends Turn {

    public TurnStandard(Player[] playersBeforeTurn) {
        super(playersBeforeTurn);
    }

    @Override
    public void doTurn() {
        Skirmish[] skirmishes = new Skirmish[getPlayersBeforeTurn().length];
        for(int i = 0 ; i < getPlayersBeforeTurn().length; i++){
            skirmishes[i] = new SkirmishStandard(super.getPlayersBeforeTurn()[i].getPlayerDeckInHand().takeCard(),super.getPlayersBeforeTurn()[i]);
        }
        Arrays.stream(skirmishes).map(Skirmish::getCard).max(Comparator.comparingInt(o -> o.getCardType().getCardValue())).get();
    }

    @Override
    public Player showWinner() {
        return null;
    }
}
