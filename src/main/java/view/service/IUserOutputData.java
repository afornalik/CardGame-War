package view.service;

import entity.Player;
import entity.Turn;

import java.util.Map;

public interface IUserOutputData {

    void printAllUserCardsInColumn(Player[] players);

    void printTurnProgress(Map<Integer, Turn> gameTurns);
}
