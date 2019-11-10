package entity.deck;

import entity.Player;

public class PlayerDeckInHand extends Deck{

    private final Player player;

    public PlayerDeckInHand(Player player) {

        this.player = player;
    }
}
