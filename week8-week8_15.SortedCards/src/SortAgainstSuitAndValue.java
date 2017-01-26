/**
 * Created by Mark on 1/25/2017.
 */
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2){
     /*   int value = card1.getSuit() - card2.getSuit();
        System.out.println("card1: " + card1.getSuit()  + " - " + "card2: " + card2.getSuit() + " = ");
        System.out.println (value);*/

        if (card1.getValue() - card2.getValue() == 0){
            return card1.getSuit() - card2.getSuit();
        }
        else if (card1.getSuit() - card2.getSuit() == 0){
            return card1.getValue() - card2.getValue();
        }
        return card1.getSuit() - card2.getSuit();

    }
}