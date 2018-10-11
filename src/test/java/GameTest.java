import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Dealer dealer;
    Player player1;
    Player player2;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new Player("p1");
        player2 = new Player("p2");
        dealer = new Dealer();
        game = new Game(player1, player2, deck, dealer);
    }
    

    @Test
    public void canJudgeHand() {
        Card player1Card = new Card(SuitType.CLUBS, CardRank.KING);
        Card player2Card = new Card(SuitType.CLUBS, CardRank.EIGHT);

        assertEquals(player1, game.judgeHand(player1Card, player2Card));
    }

    @Test
    public void winningPlayer() {

        Card player1Card = new Card(SuitType.CLUBS, CardRank.KING);
        Card player2Card = new Card(SuitType.CLUBS, CardRank.EIGHT);
        game.declareWinner(player1Card, player2Card);

        assertEquals(1, player1.getScore());

    }

    @Test
    public void gameWon() {
        Player winningPlayer = game.startGame();
        assertEquals(true, winningPlayer instanceof Player);
    }
}