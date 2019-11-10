package entity.player;

import entity.deck.player.PlayerDeckInHand;

public class Player {

    private final PlayerDeckInHand playerDeckInHand;

    public Player(PlayerDeckInHand playerDeckInHand) {
        this.playerDeckInHand = playerDeckInHand;
    }

    public PlayerDeckInHand getPlayerDeckInHand() {
        return playerDeckInHand;
    }
}
