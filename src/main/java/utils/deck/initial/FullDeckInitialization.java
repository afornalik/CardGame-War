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
    private int NUMBER_OF_CARDS_PER_PLAYER;

    public FullDeckInitialization(IPlayerInitializationService iPlayerInitializationService) {
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.NUMBER_OF_PLAYERS = iPlayerInitializationService.getNumberOfPlayers();

    }


    @Override
    public void initializeDeckOfCards() {
        fullDeck = new FullDeck();
        List<Card> cards = new ArrayList<>();
        for (CardType cardType : CardType.values()) {
            for (CardColor cardColor : CardColor.values()) {
                cards.add(new Card(cardColor, cardType));
            }
        }
        NUMBER_OF_CARDS_PER_PLAYER = cards.size() / NUMBER_OF_PLAYERS;
        fullDeck.setDeckOfCards(cards);
        fullDeck.shuffleCard();
    }

    @Override
    public PlayerDeckInHand[] splitDeckAmongPlayers() {
        PlayerDeckInHand[] playerDeckInHands = new PlayerDeckInHand[NUMBER_OF_PLAYERS];
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            List<Card> playerCardList = new ArrayList<>(fullDeck.getDeckOfCards().subList(i * NUMBER_OF_CARDS_PER_PLAYER, (i = i + 1) * NUMBER_OF_CARDS_PER_PLAYER));
            i--;
            playerDeckInHands[i] = new PlayerDeckInHand();
            playerDeckInHands[i].setDeckOfCards(playerCardList);
        }
        return playerDeckInHands;
    }
}
