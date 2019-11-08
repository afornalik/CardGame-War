package entity.deck;

import entity.Player;
import entity.cardtypes.Card;
import service.Splitable;

public class FullDeck extends Deck implements Splitable {

    private final Player[] players;

    public FullDeck(Player[] players) {
        this.players = players;
    }

    public void splitDeck() {


    }
}
