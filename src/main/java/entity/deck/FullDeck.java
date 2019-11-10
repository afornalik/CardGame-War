package entity.deck;

import entity.player.Player;

import service.deck.IInitialDeckService;



public abstract class FullDeck extends Deck implements IInitialDeckService{

    private final Player[] players;

    public FullDeck( Player[] players) {
        this.players = players;
    }

}
