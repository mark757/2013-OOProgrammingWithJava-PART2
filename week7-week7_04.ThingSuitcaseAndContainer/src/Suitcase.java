import java.util.ArrayList;

/**
 * Created by Mark on 1/10/2017.
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> suitcase = new ArrayList<>();
    private int totalWeight;


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {

        if (totalWeight + thing.getWeight() <= maxWeight) {
            totalWeight += thing.getWeight();
            suitcase.add(thing);
        }

    }

    public String toString() {
        if (suitcase.size() == 0) {
            return "empty" + " (" + totalWeight + " kg)";
        } else if (suitcase.size() == 1) {
            return suitcase.size() + " thing " + "(" + totalWeight + " kg)";
        }
        return suitcase.size() + " things " + "(" + totalWeight + " kg)";
    }

    public void printThings() {
        for (Thing thing : suitcase) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        for (Thing thing : suitcase) {
            if (heaviest == null || heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }

        }
        return heaviest;
    }

}