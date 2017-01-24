import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mark on 1/22/2017.
 */
public class ShoppingBasket {
    private Map<String, Purchase> baskets;

    public ShoppingBasket() {
        this.baskets = new HashMap<>();
    }

    public void add(String product, int price) {
        Purchase m = new Purchase(product, 1, price);
        if (!this.baskets.containsKey(product)) {
            baskets.put(product, m);
        } else {
            baskets.get(product).increaseAmount();
            // m.increaseAmount();
            //baskets.put(product, m);

        }

    }

    public int price() {
        int sum = 0;
        for (Purchase i : baskets.values()) {
            System.out.println(baskets.values());
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        for (Purchase i : baskets.values()) {
            System.out.println(i);
            // System.out.println(i.product + ": " + i.amount);
        }
    }

}
