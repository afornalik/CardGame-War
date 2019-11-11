package entity;


public abstract class Skirmish {

    private final Card card;
    private final Player player;

    protected Skirmish(Card card, Player player) {
        this.card = card;
        this.player = player;
    }

    public Card getCard() {
        return card;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Skirmish{" +
                "card=" + card +
                ", player=" + player +
                '}';
    }
}
