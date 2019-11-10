package utils.deck;

import entity.Deck;
import entity.Player;
import service.player.IPlayerInitializationService;


public class FullDeck extends Deck {

    private final Player[] players;
    private final IPlayerInitializationService iPlayerInitializationService;

    public FullDeck(IPlayerInitializationService iPlayerInitializationService) {
        this.iPlayerInitializationService = iPlayerInitializationService;
        this.players = iPlayerInitializationService.initializePlayers();
    }

}
