package utils.game.initial;

import entity.Player;
import service.deck.IDeckInitializationService;
import service.game.IGameInitializationService;
import service.player.IPlayerInitializationService;
import utils.deck.player.PlayerDeckInHand;
import utils.deck.player.PlayerDeckWinCard;
import utils.game.GameReady;

import java.util.ArrayList;


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
        for (int i = 0; i < iPlayerInitializationService.getNumberOfPlayers(); i++) {
            players[i].setPlayerDeckInHand(playerDeckInHands[i]);
            PlayerDeckWinCard playerDeckWinCard = new PlayerDeckWinCard();
            playerDeckWinCard.setDeckOfCards(new ArrayList<>());
            players[i].setPlayerDeckWinCard(playerDeckWinCard);
        }
        return new GameReady(players);
    }
}
