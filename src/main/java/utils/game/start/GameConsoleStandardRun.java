package utils.game.start;

import service.deck.IDeckInitializationService;
import service.game.IGameStandardService;
import service.player.IPlayerInitializationService;
import utils.deck.initial.FullDeckInitialization;
import utils.game.GameReady;
import utils.game.initial.GameInitialization;
import utils.player.initial.PlayerInitialization;
import view.View;
import view.ViewFactory;
import view.ViewOption;

public class GameConsoleStandardRun implements IGameStandardService {

    private final View view = new ViewFactory().createView(ViewOption.CONSOLE);
    private IPlayerInitializationService iPlayerInitializationService;
    private IDeckInitializationService iDeckInitializationService;
    private GameReady gameReady ;


    @Override
    public void begin() {
        view.writeGreeting();
        view.writeRules();

        iPlayerInitializationService = new PlayerInitialization();
        iPlayerInitializationService.setNumberOfPlayers(view.setupNumbersOfPlayers());

        iDeckInitializationService = new FullDeckInitialization(iPlayerInitializationService);

        gameReady = new GameInitialization(iDeckInitializationService,iPlayerInitializationService).initializeGame();

        view.writeMessageAfterShuffleTheDeck();
    }

    @Override
    public void nextTurn() {
        view.printAllUserCardsInColumn(gameReady.getPlayers());
    }
}
