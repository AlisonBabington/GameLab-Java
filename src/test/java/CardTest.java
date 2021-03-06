import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, CardRank.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.KING, card.getRank());
    }

    @Test
    public void kingHasValue10(){
        assertEquals(10, card.getValueFromEnum());
    }


}