package utils.game.initial;

import entity.Deck;
import entity.Game;
import entity.Player;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;
import service.player.IPlayerInitializationService;
import utils.deck.player.PlayerDeckInHand;
import utils.game.GameReady;
import view.View;
import view.ViewFactory;
import view.ViewOption;

public class GameInitialization implements IGameInitializationService {

    private final IDeckInitializationService iDeckInitializationService;
    private final IPlayerInitializationService iPlayerInitializationService;
    private final View view;

    public GameInitialization(IDeckInitializationService iDeckInitializationService, IPlayerInitializationService iPlayerInitializationService, View view) {
        this.iDeckInitializationService = iDeckInitializationService;
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.view = view;
    }


    @Override
    public GameReady initializeGame() {
        view.writeGreeting();
        view.writeRules();

        iDeckInitializationService.initializeDeckOfCards();
        PlayerDeckInHand[] playerDeckInHands = iDeckInitializationService.splitDeckAmongPlayers();
        Player[] players = iPlayerInitializationService.initializePlayers();
        for(int i = 0 ; i < iPlayerInitializationService.getNumberOfPlayers(); i++){
            players[i].setPlayerDeckInHand(playerDeckInHands[i]);
        }
        GameReady gameReady = new GameReady(view,players);
        return gameReady;
    }
}
