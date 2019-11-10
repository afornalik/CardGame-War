package entity.player.initial;

import entity.player.Player;
import service.player.IPlayerInitializationService;

public class PlayerInitialization implements IPlayerInitializationService {
    
    @Override
    public Player[] initializePlayers() {
        return new Player[0];
    }
}
