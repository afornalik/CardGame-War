package service.player;

import entity.Player;

public interface IPlayerInitializationService {

    Player[] initializePlayers();

    int getNumberOfPlayers();

    void setNumberOfPlayers(int numberOfPlayers);
}
