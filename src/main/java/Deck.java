import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }


    public void fillDeck() {
        for(SuitType suit : SuitType.values()){
            SuitType thisSuit = suit;
            for (CardRank rank : CardRank.values()){
                CardRank thisRank = rank;
                Card thisCard = new Card (thisSuit, thisRank);
                this.cards.add(thisCard);
            }

        }
    }

    public int getSize() {
        return this.cards.size();
    }
}
