package utils.player.initial;

import entity.Player;
import service.player.IPlayerInitializationService;

public class PlayerInitialization implements IPlayerInitializationService {

    private final int numberOfPlayers;

    public PlayerInitialization(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public Player[] initializePlayers() {
        Player[] players = new Player[numberOfPlayers];
        for(int i = 0 ; i< numberOfPlayers ; i++){
            players[i] = new Player();
        }
        return players;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
