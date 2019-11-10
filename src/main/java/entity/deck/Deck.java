package entity.deck;

import entity.cardtypes.Card;



import java.util.List;

public abstract class Deck{

    private List<Card> deckOfCards;

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }
}
