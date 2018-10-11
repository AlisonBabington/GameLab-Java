public class Dealer {


    public void dealDeck(Deck deck, Player player1, Player player2) {
        deck.fillDeck();
        deck.shuffleDeck();
        Card player1Card = deck.getCard();
        player1.recieveCard(player1Card);
        Card player2Card = deck.getCard();
        player2.recieveCard(player2Card);
    }
}
