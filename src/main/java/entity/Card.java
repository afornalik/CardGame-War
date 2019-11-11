package entity;

import entity.cardtypes.CardColor;
import entity.cardtypes.CardType;

public class Card {

    private final CardColor cardColor;
    private final CardType cardType;

    public Card(CardColor cardColor, CardType cardType) {
        this.cardColor = cardColor;
        this.cardType = cardType;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public CardType getCardType() {
        return cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardColor=" + cardColor +
                ", cardType=" + cardType +
                '}';
    }
}
