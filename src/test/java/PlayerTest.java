import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Player player2;
    Card card;


    @Before
    public void before(){
        player = new Player("Player1");
        player2 = new Player("Player2");
        card = new Card(SuitType.CLUBS, CardRank.KING);
    }

    @Test
    public void getHandSize(){
    assertEquals(0, player.getHandSize());
    }

    @Test
    public void playHand(){
    player.recieveCard(card);
    assertEquals(card, player.playCard());

    }
}

