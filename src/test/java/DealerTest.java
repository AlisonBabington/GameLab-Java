import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new Player("p1");
        player2 = new Player("p2");
        dealer = new Dealer();

    }

    @Test
    public void canDeal(){
        dealer.dealDeck(deck, player1, player2);
        assertEquals(1, player1.getHandSize());
        assertEquals(1, player2.getHandSize());
    }
}
