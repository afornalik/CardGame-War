package entity;

import entity.deck.PlayerDeck;

public class Player {

    private final PlayerDeck playerDeck;

    public Player(PlayerDeck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public PlayerDeck getPlayerDeck() {
        return playerDeck;
    }
}
