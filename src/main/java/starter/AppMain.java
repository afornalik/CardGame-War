package starter;

import utils.game.start.GameConsoleStandardRun;

public class AppMain {

    public static void main(String[] args) {
        GameConsoleStandardRun gameConsoleStandardRun = new GameConsoleStandardRun();

        gameConsoleStandardRun.begin();
        gameConsoleStandardRun.nextTurn();
    }
}
