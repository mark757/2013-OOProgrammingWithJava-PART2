import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Mark on 1/21/2017.
 */
public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stock;
    //private String product;
    // private int price;
    // private int stock;

    public Storehouse() {
        this.store = new HashMap<>();
        this.stock = new HashMap<>();
        // this.product = product;
        //this.price = price;

    }

    public void addProduct(String product, int price, int stock) {
        this.store.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for (String item : store.keySet()) {
            if (store.containsKey(item)) {
                if (store.get(product) == (null)) {
                    return -99;
                }
            }
        }
        return store.get(product);
    }

    public int stock(String product) {
        if (stock.get(product) == null) {
            return 0;
        }

        if (stock.get(product) > 0 || stock.get(product) != null) {

            return stock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (stock.get(product) == null) {
            return false;
        }
        if (stock.get(product) >= 1) {
            stock.put(product, stock.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String key : store.keySet()) {
            products.add(key);
        }
        return products;
    }


}
