package TwentyPlusOne;

public class Card {
    Rank rank;
    Suit suit;
    Color color;
    int value;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

        if (suit == Suit.CLUBS || suit == Suit.SPADES){
            this.color = Color.BLACK;
        }else {
            this.color = Color.RED;
        }
    }



    @Override
    public String toString() {
        return this.rank + " of "+this.suit;
    }
}
