package entity.cardtypes;

public class Card {

    private final CardColor cardColor;
    private final CardType cardType;

    public Card(CardColor cardColor, CardType cardType) {
        this.cardColor = cardColor;
        this.cardType = cardType;
    }
}
