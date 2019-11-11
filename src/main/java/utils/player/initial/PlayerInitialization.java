package utils.player.initial;

import entity.Player;
import service.player.IPlayerInitializationService;

public class PlayerInitialization implements IPlayerInitializationService {

    private int numberOfPlayers;

    public PlayerInitialization() {
    }

    @Override
    public Player[] initializePlayers() {
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player("Player "+(i=i+1));
            i--;
        }
        return players;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @Override
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
