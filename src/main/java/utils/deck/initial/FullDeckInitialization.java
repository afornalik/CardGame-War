package utils.deck.initial;

import entity.Card;
import entity.Deck;
import entity.cardtypes.CardColor;
import entity.cardtypes.CardType;
import service.player.IPlayerInitializationService;
import utils.deck.FullDeck;
import service.deck.IDeckInitializationService;
import utils.deck.player.PlayerDeckInHand;

import java.util.ArrayList;
import java.util.List;


public class FullDeckInitialization implements IDeckInitializationService {

    private final IPlayerInitializationService iPlayerInitializationService;
    private FullDeck fullDeck;
    private final int NUMBER_OF_PLAYERS;

    public FullDeckInitialization(IPlayerInitializationService iPlayerInitializationService) {
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.NUMBER_OF_PLAYERS = iPlayerInitializationService.getNumberOfPlayers();
    }


    @Override
    public Deck initializeDeckOfCards() {
        fullDeck = new FullDeck();
        List<Card> cards = new ArrayList<>();
        for (CardType cardType : CardType.values()) {
            for (CardColor cardColor : CardColor.values()) {
                cards.add(new Card(cardColor, cardType));
            }
        }
        fullDeck.setDeckOfCards(cards);
        fullDeck.shuffleCard();
        return fullDeck;
    }

    @Override
    public PlayerDeckInHand[] splitDeckAmongPlayers() {
        PlayerDeckInHand[] playerDeckInHands = new PlayerDeckInHand[NUMBER_OF_PLAYERS];
        for(int i = 0 ; i< NUMBER_OF_PLAYERS; i++){
            List<Card> playerCardList = new ArrayList<>(fullDeck.getDeckOfCards().subList(i * NUMBER_OF_PLAYERS, (i++) * NUMBER_OF_PLAYERS));
            playerDeckInHands[i] = new PlayerDeckInHand();
            playerDeckInHands[i].setDeckOfCards(playerCardList);
        }
        return playerDeckInHands;
    }
}
