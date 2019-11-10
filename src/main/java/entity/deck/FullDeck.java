package entity.deck;

import entity.Player;
import entity.cardtypes.Card;
import service.Shuffable;
import service.Splitable;

import java.util.List;

public abstract class FullDeck extends Deck implements Splitable, Shuffable {

    private final Player[] players;
    private final int NUMBER_OF_CARDS_PER_PLAYER;

    public FullDeck(List<Card> deckOfCards, Player[] players) {
        this.players = players;
        this.NUMBER_OF_CARDS_PER_PLAYER = super.getDeckOfCards().size() / players.length;
    }

}
