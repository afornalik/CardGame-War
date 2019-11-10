package entity.deck;

import entity.cardtypes.Card;
import service.deck.IStandardDeckService;


import java.util.Collections;
import java.util.List;

public abstract class Deck implements IStandardDeckService {

    private List<Card> deckOfCards;

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    @Override
    public void shuffleCard() {
        Collections.shuffle(deckOfCards);
    }
}
