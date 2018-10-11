public class Game {

    private Player player1;
    private Player player2;
    private Deck deck;
    private Dealer dealer;

    public Game(Player player1, Player player2, Deck deck, Dealer dealer) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        this.dealer = dealer;
    }

    public Player startGame() {
        while (player1.getScore() < 3 || player2.getScore() < 3) {
            dealer.dealDeck(deck, player1, player2);
            Card player1Card = player1.playCard();
            Card player2Card = player2.playCard();
            declareWinner(player1Card, player2Card);
        }
        System.out.println(player1.getScore());
        Player winner = player1.getScore() > player2.getScore()? player1 : player2;
        System.out.println(winner);
     return winner;
    }
    public void declareWinner(Card card, Card card2){
        if (card == card2) {
            return; }
       Player winningPlayer = judgeHand(card,card2);
       winningPlayer.updateScore();
    }


    public Player judgeHand(Card player1Card, Card player2Card) {
        return player1Card.getValueFromEnum() > player2Card.getValueFromEnum()? player1 : player2;
    }

}
