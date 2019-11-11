package entity;

import service.deck.IDeckStandardService;


import java.util.Collections;
import java.util.List;

public abstract class Deck implements IDeckStandardService {

    private List<Card> deckOfCards;

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    @Override
    public void shuffleCard() {
        Collections.shuffle(deckOfCards);
    }

    @Override
    public Card takeCard() {
        return deckOfCards.remove(0);
    }
}
