package utils.deck.player;

import entity.Deck;

public class PlayerDeckWinCard extends Deck {

    @Override
    public String toString() {
        return "\n"+super.getDeckOfCards().toString();
    }
}
