package entity;

import utils.deck.player.PlayerDeckInHand;
import utils.deck.player.PlayerDeckWinCard;

public class Player {

    private PlayerDeckInHand playerDeckInHand;
    private PlayerDeckWinCard playerDeckWinCard;

    public Player(PlayerDeckInHand playerDeckInHand, PlayerDeckWinCard playerDeckWinCard) {
        this.playerDeckInHand = playerDeckInHand;
        this.playerDeckWinCard = playerDeckWinCard;
    }

    public Player() {
    }

    public PlayerDeckInHand getPlayerDeckInHand() {
        return playerDeckInHand;
    }

    public void setPlayerDeckInHand(PlayerDeckInHand playerDeckInHand) {
        this.playerDeckInHand = playerDeckInHand;
    }

    public PlayerDeckWinCard getPlayerDeckWinCard() {
        return playerDeckWinCard;
    }

    public void setPlayerDeckWinCard(PlayerDeckWinCard playerDeckWinCard) {
        this.playerDeckWinCard = playerDeckWinCard;
    }
}