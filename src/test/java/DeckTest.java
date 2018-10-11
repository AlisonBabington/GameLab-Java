import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();


    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.getSize());
    }
    @Test
    public void hasFullDeck(){
        deck.fillDeck();
        assertEquals(52, deck.getSize());
    }
}
