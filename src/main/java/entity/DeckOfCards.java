package entity;

import service.Shuffable;

import java.util.Collections;
import java.util.List;

public class DeckOfCards implements Shuffable {

    private List<Card> deckOfCards;

    public void shuffleCard() {
        Collections.shuffle(deckOfCards);
    }
}
