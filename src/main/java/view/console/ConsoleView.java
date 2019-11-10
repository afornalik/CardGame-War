package view.console;

import view.View;
import view.service.IUserInputData;
import view.service.IUserOutputData;
import view.service.IUserOutputMesseges;


public class ConsoleView extends View implements IUserInputData, IUserOutputData, IUserOutputMesseges {

    @Override
    public void writeGreeting() {
        System.out.println("\tWelcome to card game - war.\n\n");
    }

    @Override
    public void writeRules() {
        System.out.println("\tRules :");
        System.out.println("\tFirst you need to setup a numbers of players involved in game, \n" +
                "\tAfter each player will gain a deck from shuffled deck of cards. \n" +
                "\tIn every turn all players draw one card from stack and put it out on a table. \n" +
                "\tHighest card win and owner of this card takes all cards. \n" +
                "\tGame ends when players will have not any cards in theirs hand, \n" +
                "\tand the winner is one who gathered highest amount of cards. ");
    }
}
