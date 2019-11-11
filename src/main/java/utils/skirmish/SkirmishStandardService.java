package utils.skirmish;

import entity.Card;
import entity.Player;
import entity.Skirmish;
import service.skirmish.ISkirmishStandardService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkirmishStandardService implements ISkirmishStandardService {



    public SkirmishStandardService() {

    }

    @Override
    public Skirmish receiveWinner(Skirmish[] candidatesForSkirmish) {

        Skirmish winnerOfSkirmish = Arrays.stream(candidatesForSkirmish)
                .max(Comparator.comparingInt(value -> value.getCard().getCardType().getCardValue()))
                .get();

        Player winner = winnerOfSkirmish.getPlayer();

        List<Card> cardsForWinner = Arrays.stream(candidatesForSkirmish).map(Skirmish::getCard).collect(Collectors.toList());
        List<Card> winnerCards = winner.getPlayerDeckWinCard().getDeckOfCards();

        winnerCards.addAll(cardsForWinner);

        winner.getPlayerDeckWinCard().setDeckOfCards(winnerCards);

        return new SkirmishStandard(null, winner);
    }


}
