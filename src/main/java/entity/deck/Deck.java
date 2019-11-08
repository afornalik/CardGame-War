package entity.deck;

import entity.cardtypes.Card;
import service.Shuffable;

import java.util.Collections;
import java.util.List;

public abstract class Deck implements Shuffable {

    private List<Card> deckOfCards;

    public Deck(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public void shuffleCard() {
        Collections.shuffle(deckOfCards);
    }

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }
}
