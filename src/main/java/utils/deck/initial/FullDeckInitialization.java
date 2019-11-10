package utils.deck.initial;

import entity.Deck;
import utils.deck.FullDeck;
import service.deck.IDeckInitializationService;


public class FullDeckInitialization  implements IDeckInitializationService {

    private final FullDeck fullDeck;

    public FullDeckInitialization(FullDeck fullDeck) {
        this.fullDeck = fullDeck;
    }


    @Override
    public Deck initializeDeckOfCards() {
        return null;
    }

    @Override
    public void splitDeckAmongPlayers() {

    }
}
