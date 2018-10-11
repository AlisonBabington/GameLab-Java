import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Deck deck2;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        deck2 = new Deck();


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

    @Test
    public void canShuffleDeck(){
        deck.fillDeck();
        deck2.fillDeck();
        deck2.shuffleDeck();

    }

}
