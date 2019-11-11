package utils.game.start;

import entity.Turn;
import service.deck.IDeckInitializationService;
import service.game.IGameStandardService;
import service.player.IPlayerInitializationService;
import service.skirmish.ISkirmishStandardService;
import utils.deck.initial.FullDeckInitialization;
import utils.game.GameReady;
import utils.game.initial.GameInitialization;
import utils.player.initial.PlayerInitialization;
import utils.skirmish.SkirmishStandardService;
import utils.turn.TurnStandard;
import view.View;
import view.ViewFactory;
import view.ViewOption;

import java.util.HashMap;

public class GameConsoleStandardRun implements IGameStandardService {

    private final View view = new ViewFactory().createView(ViewOption.CONSOLE);
    private IPlayerInitializationService iPlayerInitializationService;
    private IDeckInitializationService iDeckInitializationService;
    private GameReady gameReady;
    private int turnNumber =1;


    @Override
    public void begin() {
        view.writeGreeting();
        view.writeRules();

        iPlayerInitializationService = new PlayerInitialization();
        iPlayerInitializationService.setNumberOfPlayers(view.setupNumbersOfPlayers());

        iDeckInitializationService = new FullDeckInitialization(iPlayerInitializationService);

        gameReady = new GameInitialization(iDeckInitializationService, iPlayerInitializationService).initializeGame();
        gameReady.setGameProgress(new HashMap<Integer,Turn>());
        view.writeMessageAfterShuffleTheDeck();
    }

    @Override
    public void nextTurn() {
        view.printAllUserCardsInColumn(gameReady.getPlayers());

        ISkirmishStandardService iSkirmishStandardService = new SkirmishStandardService();
        Turn turn = new TurnStandard(gameReady.getPlayers(),iSkirmishStandardService);
        this.nextTurnRecursive(turn);

        view.printTurnProgress(gameReady.getGameProgress());

    }

    private Turn nextTurnRecursive(Turn previousTurn) {
        if (previousTurn.getPlayersBeforeTurn()[0].getPlayerDeckInHand().getDeckOfCards().size() == 0) {
            return null;
        }
        gameReady.getGameProgress().put(turnNumber,previousTurn);
        turnNumber++;
        Turn turn = new TurnStandard(previousTurn.getPlayersBeforeTurn(),previousTurn.getiSkirmishStandardService());
        turn.doTurn();
        return this.nextTurnRecursive(turn);
    }
}
