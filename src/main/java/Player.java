import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public int getHandSize() {
        return this.hand.size();
    }

    public void recieveCard(Card dealtCard) {
        hand.add(dealtCard);
    }

    public Card playCard() {
        return hand.remove(0);
    }

    public int getScore() {
        return score;
    }

    public void updateScore(){
       score += 1;
    }
}
