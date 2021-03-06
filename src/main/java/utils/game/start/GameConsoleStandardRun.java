package utils.game.start;

import entity.Player;
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

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class GameConsoleStandardRun implements IGameStandardService {

    private final View view = new ViewFactory().createView(ViewOption.CONSOLE);
    private IPlayerInitializationService iPlayerInitializationService;
    private IDeckInitializationService iDeckInitializationService;
    private GameReady gameReady;
    private int turnNumber;


    @Override
    public void begin() {
        turnNumber = 1;
        view.writeGreeting();
        view.writeRules();

        iPlayerInitializationService = new PlayerInitialization();

        int numberOfPlayers;
        do{
            numberOfPlayers = view.setupNumbersOfPlayers();
        }while(numberOfPlayers == 0);

        iPlayerInitializationService.setNumberOfPlayers(numberOfPlayers);

        iDeckInitializationService = new FullDeckInitialization(iPlayerInitializationService);

        gameReady = new GameInitialization(iDeckInitializationService, iPlayerInitializationService).initializeGame();
        gameReady.setGameProgress(new HashMap<>());
        view.writeMessageAfterShuffleTheDeck();
    }

    @Override
    public void makeAllTurn() {
        view.printAllUserCardsInColumn(gameReady.getPlayers());

        ISkirmishStandardService iSkirmishStandardService = new SkirmishStandardService();
        Turn turn = new TurnStandard(gameReady.getPlayers(),iSkirmishStandardService);
        this.nextTurnRecursive(turn);

        view.printTurnProgress(gameReady.getGameProgress());

    }

    @Override
    public void finish() {
        Player[] players = gameReady.getGameProgress().get(gameReady.getGameProgress().size()).getPlayersBeforeTurn();
        view.printWinner(Arrays
                .stream(players)
                .max(Comparator.comparingInt(value -> value.getPlayerDeckWinCard().getDeckOfCards().size()))
                .get());
    }

    @Override
    public String playAgain() {
        return view.setupNextGame();
    }

    private Turn nextTurnRecursive(Turn previousTurn) {
        if (previousTurn.getPlayersBeforeTurn()[0].getPlayerDeckInHand().getDeckOfCards().size() == 0) {
            return null;
        }
        Turn turn = new TurnStandard(previousTurn.getPlayersBeforeTurn(),previousTurn.getiSkirmishStandardService());
        turn.doTurn();
        gameReady.getGameProgress().put(turnNumber,turn);
        turnNumber++;
        return this.nextTurnRecursive(turn);
    }
}
