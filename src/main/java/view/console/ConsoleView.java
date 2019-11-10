package view.console;

import view.View;

import java.util.Scanner;


public class ConsoleView extends View  {

    private Scanner inputData = new Scanner(System.in);

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

    @Override
    public int setupNumbersOfPlayers() {
        System.out.println("\n\tSetup number of players (2-4) : ");
        return inputData.nextInt();
    }
}
