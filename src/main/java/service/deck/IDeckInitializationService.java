package service.deck;

import utils.deck.player.PlayerDeckInHand;

public interface IDeckInitializationService {

    void initializeDeckOfCards();

    PlayerDeckInHand[] splitDeckAmongPlayers();
}
