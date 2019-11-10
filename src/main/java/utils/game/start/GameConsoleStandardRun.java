package utils.game.start;

import service.deck.IDeckInitializationService;
import service.player.IPlayerInitializationService;
import utils.deck.initial.FullDeckInitialization;
import utils.game.GameReady;
import utils.game.initial.GameInitialization;
import utils.player.initial.PlayerInitialization;
import view.View;
import view.ViewFactory;
import view.ViewOption;

public class GameConsoleStandardRun {

    private View view = new ViewFactory().createView(ViewOption.CONSOLE);
    private IPlayerInitializationService iPlayerInitializationService = new PlayerInitialization(view.setupNumbersOfPlayers());
    private IDeckInitializationService iDeckInitializationService = new FullDeckInitialization(iPlayerInitializationService);
    private GameReady gameReady = new GameInitialization(iDeckInitializationService,iPlayerInitializationService,view).initializeGame();



}
