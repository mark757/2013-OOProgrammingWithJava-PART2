import java.util.ArrayList;

/**
 * Created by Mark on 1/21/2017.
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> toBeStoreds;


    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.toBeStoreds = new ArrayList<>();
    }

    public void add(ToBeStored t) {
        if (weight() + t.weight() <= maxWeight) {
            toBeStoreds.add(t);
        }

    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item : toBeStoreds) {
            weight += item.weight();
        }
        return weight;
    }

    public int howManyItems() {
        return toBeStoreds.size();
    }

    public String toString() {
        return "Box: " + howManyItems() + " things, " + "total weight " + weight() + " kg";
    }

}
