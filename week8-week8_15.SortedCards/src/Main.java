public class Main {

    public static void main(String[] args) {
        // write some test code here
        Card first = new Card(10,Card.SPADES);
        Card second = new Card(10,Card.HEARTS);
        System.out.println(first.compareTo(second));
    }
}
