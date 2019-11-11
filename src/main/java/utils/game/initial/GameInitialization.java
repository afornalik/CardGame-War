package utils.game.initial;

import entity.Player;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;
import service.player.IPlayerInitializationService;
import utils.deck.player.PlayerDeckInHand;
import utils.game.GameReady;


public class GameInitialization implements IGameInitializationService {

    private final IDeckInitializationService iDeckInitializationService;
    private final IPlayerInitializationService iPlayerInitializationService;


    public GameInitialization(IDeckInitializationService iDeckInitializationService, IPlayerInitializationService iPlayerInitializationService) {
        this.iDeckInitializationService = iDeckInitializationService;
        this.iPlayerInitializationService = iPlayerInitializationService;
    }


    @Override
    public GameReady initializeGame() {

        iDeckInitializationService.initializeDeckOfCards();
        PlayerDeckInHand[] playerDeckInHands = iDeckInitializationService.splitDeckAmongPlayers();
        Player[] players = iPlayerInitializationService.initializePlayers();
        for(int i = 0 ; i < iPlayerInitializationService.getNumberOfPlayers(); i++){
            players[i].setPlayerDeckInHand(playerDeckInHands[i]);
        }
        return new GameReady(players);
    }
}
