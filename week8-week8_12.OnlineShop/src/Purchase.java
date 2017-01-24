/**
 * Created by Mark on 1/22/2017.
 */
public class Purchase {
    String product;
    int amount;
    int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
       // unitPrice = amount * unitPrice;
        return this.unitPrice * this.amount;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public String toString() {
        return this.product + ": " + this.amount;
    }
}
