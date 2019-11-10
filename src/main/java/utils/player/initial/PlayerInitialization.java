package utils.player.initial;

import entity.Player;
import service.player.IPlayerInitializationService;

public class PlayerInitialization implements IPlayerInitializationService {
    
    @Override
    public Player[] initializePlayers(int numberOfPlayers) {
        Player[] players = new Player[numberOfPlayers];
        for(int i = 0 ; i< numberOfPlayers ; i++){
            players[i] = new Player();
        }
        return players;
    }
}
