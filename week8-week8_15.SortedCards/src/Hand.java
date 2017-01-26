import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mark on 1/24/2017.
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        System.out.println("WHAT");
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand hands) {
        int handOne = 0;
        int handTwo = 0;

        for (Card card : hand) {
            handOne += card.getValue();
        }

        for (Card card : hands.hand) {
            handTwo += card.getValue();
        }

       /* if (handOne > handTwo) {
            return 1;
        } else if (handOne < handTwo) {
            return -1;
        } else {
            return 0;
        }
    }*/
        return handOne - handTwo;
    }

    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
