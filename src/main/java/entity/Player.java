package entity;

import utils.deck.player.PlayerDeckInHand;
import utils.deck.player.PlayerDeckWinCard;

public class Player {

    private PlayerDeckInHand playerDeckInHand;
    private PlayerDeckWinCard playerDeckWinCard;
    private final String playerName;

    public Player(PlayerDeckInHand playerDeckInHand, PlayerDeckWinCard playerDeckWinCard, String playerName) {
        this.playerDeckInHand = playerDeckInHand;
        this.playerDeckWinCard = playerDeckWinCard;
        this.playerName = playerName;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
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

    @Override
    public String toString() {
        return "Player{" +
                "playerDeckInHand=" + playerDeckInHand +
                ", playerDeckWinCard=" + playerDeckWinCard +
                '}';
    }
}