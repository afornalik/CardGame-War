package view.console;

import entity.Card;
import entity.Player;
import entity.Turn;
import view.View;
import view.exception.InputPlayerNumberException;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;



public class ConsoleView extends View {

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
    public void writeMessageAfterShuffleTheDeck() {
        System.out.println("\n\tNow card will be shuffled and deal among players ");
        System.out.println("\n\tpress button ");
        inputData.nextLine();
        inputData.nextLine();
    }

    @Override
    public int setupNumbersOfPlayers() {
        System.out.print("\n\tSetup number of players (2-4) : ");
        int numberOfPlayers;
        try {
             numberOfPlayers = inputData.nextInt();
             if(numberOfPlayers <2 || numberOfPlayers >4){
                 throw  new InputPlayerNumberException();
             }
        }catch (InputMismatchException e){
            System.out.println("\n\tInsert number.");
            numberOfPlayers = 0;
            inputData.nextLine();
        }catch (InputPlayerNumberException e){
            System.out.println("\n\tNumber of players should be between 2 and 4.");
            numberOfPlayers = 0;
        }
        return numberOfPlayers;
    }

    @Override
    public String setupNextGame() {
        System.out.println("\n\tPlay again ? (y/n) : ");
        return inputData.next();
    }

    @Override
    public void printAllUserCardsInColumn(Player[] players) {
        for (int i = 0; i < players[0].getPlayerDeckInHand().getDeckOfCards().size(); i++) {
            for (Player player : players) {
                Card card = player.getPlayerDeckInHand().getDeckOfCards().get(i);
                System.out.printf("   | %3d %5s %10s |   ", ++i, card.getCardType(), card.getCardColor());
                i--;
            }
            System.out.println();
        }
        System.out.println("\n\tpress button ");
        inputData.nextLine();
    }

    @Override
    public void printTurnProgress(Map<Integer,Turn> gameTurns) {
        System.out.println("\n\tProgress of the game");
        for (Map.Entry<Integer, Turn> gameTurn : gameTurns.entrySet()) {
            System.out.println("\tTurn :  " + gameTurn.getKey() + "\t win : " + gameTurn.getValue().getWinner().getPlayerName());
        }
        System.out.println("\n\tpress button ");
        inputData.nextLine();
    }

    @Override
    public void printWinner(Player player) {
        System.out.println("\tWinner of the game is : "+ player.getPlayerName());
    }

}
