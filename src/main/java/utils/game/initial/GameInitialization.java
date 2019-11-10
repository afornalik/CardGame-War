package utils.game.initial;

import entity.Deck;
import entity.Game;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;

public class GameInitialization implements IGameInitializationService {

    private final IDeckInitializationService iDeckInitializationService;

    protected GameInitialization(IDeckInitializationService iDeckInitializationService) {
        this.iDeckInitializationService = iDeckInitializationService;
    }


    @Override
    public Game initializeGame() {
        Deck deck = iDeckInitializationService.initializeDeckOfCards();
        return null;
    }
}
