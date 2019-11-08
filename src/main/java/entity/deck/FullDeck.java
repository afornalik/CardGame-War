package entity.deck;

import entity.Player;
import entity.cardtypes.Card;
import service.Splitable;

import java.util.List;

public class FullDeck extends Deck implements Splitable {

    private final Player[] players;
    private final int NUMBER_OF_CARDS_PER_PLAYER;

    public FullDeck(List<Card> deckOfCards, Player[] players) {
        super(deckOfCards);
        this.players = players;
        this.NUMBER_OF_CARDS_PER_PLAYER = super.getDeckOfCards().size() / players.length;
    }

    public void splitDeck() {
        for (int i = 0; i < players.length; i++) {
            PlayerDeck playerDeck = new PlayerDeck(super.getDeckOfCards().subList(i * NUMBER_OF_CARDS_PER_PLAYER, (i + 1) * NUMBER_OF_CARDS_PER_PLAYER));
            players[i] = new Player(playerDeck);
        }
    }
}
