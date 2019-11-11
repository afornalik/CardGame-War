package starter;

import utils.game.start.GameConsoleStandardRun;

public class AppMain {

    public static void main(String[] args) {
        GameConsoleStandardRun gameConsoleStandardRun = new GameConsoleStandardRun();
        do {
            gameConsoleStandardRun.begin();
            gameConsoleStandardRun.makeAllTurn();
            gameConsoleStandardRun.finish();
        }while (gameConsoleStandardRun.playAgain().toUpperCase().equals("Y"));
    }
}
