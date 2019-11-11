package service.turn;

import entity.Player;

public interface ITurnProgressService {

    void doTurn();

    Player showWinner();
}
