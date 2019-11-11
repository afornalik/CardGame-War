import entity.Card;
import entity.cardtypes.CardColor;
import entity.cardtypes.CardType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class DeckTest {



    @Before
   public void init() {
        List<Card> dummyDeckCard = Arrays.asList(new Card(CardColor.CLUB, CardType.ACE),new Card(CardColor.DIAMOND, CardType.JACK),new Card(CardColor.SPADE, CardType.SIX));
    }

    @Test
    public void shouldShuffleTheDeck() {

    }
}
