package entity.game.initial;

import entity.game.Game;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;
import service.player.IPlayerInitializationService;

public class GameInitialization implements IGameInitializationService {

    private final IDeckInitializationService iDeckInitializationService;
    private final IPlayerInitializationService iPlayerInitializationService;
    private final IDeckInitializationService getiDeckInitializationService;

    protected GameInitialization(IDeckInitializationService iDeckInitializationService, IPlayerInitializationService iPlayerInitializationService, IDeckInitializationService getiDeckInitializationService) {
        this.iDeckInitializationService = iDeckInitializationService;
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.getiDeckInitializationService = getiDeckInitializationService;
    }


    @Override
    public Game initializeGame() {
        return null;
    }
}
