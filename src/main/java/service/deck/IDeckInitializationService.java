package service.deck;

import entity.Deck;

public interface IDeckInitializationService {

   Deck initializeDeckOfCards();

   void splitDeckAmongPlayers();
}
