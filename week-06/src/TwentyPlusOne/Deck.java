package TwentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    Deck(){}

    public Card pullFirst(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(this.deck);
        return deck;
    }

    public  ArrayList<Card> newDeck(){
        for (Suit s:
             Suit.values()) {
            for (Rank r :
                    Rank.values()) {
                deck.add(new Card(r,s));
            }
        }
        return deck;
    }
}
