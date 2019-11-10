package entity.deck;

import entity.player.Player;

import service.deck.IDeckInitializationService;



public abstract class FullDeck extends Deck implements IDeckInitializationService {

    private final Player[] players;

    public FullDeck(Player[] players) {
        this.players = players;
    }

}
