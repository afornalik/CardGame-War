package entity.deck;

import entity.Player;

import service.IInitialDeckService;



public abstract class FullDeck extends Deck implements IInitialDeckService{

    private final Player[] players;

    public FullDeck( Player[] players) {
        this.players = players;
    }

}
