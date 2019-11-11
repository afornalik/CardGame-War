package service.deck;

import entity.Card;

public interface IDeckStandardService {

    void shuffleCard();

    Card takeCard();
}
