package entity.deck;

import entity.Player;
import entity.cardtypes.Card;
import service.IInitialDeckService;

import java.util.List;

public abstract class FullDeck extends Deck implements IInitialDeckService{

    private final Player[] players;
    private final int NUMBER_OF_CARDS_PER_PLAYER;

    public FullDeck(List<Card> deckOfCards, Player[] players) {
        this.players = players;
        this.NUMBER_OF_CARDS_PER_PLAYER = super.getDeckOfCards().size() / players.length;
    }

}
