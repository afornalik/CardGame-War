package entity.deck.player;

import entity.player.Player;
import entity.deck.Deck;

public class PlayerDeckInHand extends Deck {

    private final Player player;

    public PlayerDeckInHand(Player player) {

        this.player = player;
    }
}
