package service.deck;

import entity.Deck;
import utils.deck.player.PlayerDeckInHand;

public interface IDeckInitializationService {

   Deck initializeDeckOfCards();

   PlayerDeckInHand[] splitDeckAmongPlayers();
}
