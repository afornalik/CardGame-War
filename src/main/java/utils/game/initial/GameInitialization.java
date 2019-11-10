package utils.game.initial;

import entity.Deck;
import entity.Game;
import entity.Player;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;
import service.player.IPlayerInitializationService;
import view.View;
import view.ViewFactory;
import view.ViewOption;

public class GameInitialization implements IGameInitializationService {

    private final IDeckInitializationService iDeckInitializationService;
    private final IPlayerInitializationService iPlayerInitializationService;
    private final View view;

    protected GameInitialization(IDeckInitializationService iDeckInitializationService, IPlayerInitializationService iPlayerInitializationService, ViewOption viewOption) {
        this.iDeckInitializationService = iDeckInitializationService;
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.view = new ViewFactory().createView(viewOption);
    }


    @Override
    public Game initializeGame() {
        view.writeGreeting();
        view.writeRules();

        Deck deck = iDeckInitializationService.initializeDeckOfCards();
        Player[] players = iPlayerInitializationService.initializePlayers();
        return null;
    }
}
