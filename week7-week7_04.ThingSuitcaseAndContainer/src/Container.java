import java.util.ArrayList;

/**
 * Created by Mark on 1/14/2017.
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;
    private int totalWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        container = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight+suitcase.totalWeight() <= maxWeight) {
            container.add(suitcase);
            totalWeight += suitcase.totalWeight();
            System.out.println("==================================");
            System.out.println("total weight: " + totalWeight);
            System.out.println("amount of suitcases: " + container.size());
            System.out.println("max weight: " + maxWeight);
            System.out.println("==================================");
        }
    }

    public String toString() {
        return container.size() + " suitcases " + "("+ totalWeight +" kg)";
    }

    public void printThings(){
        for (Suitcase suitcase : container){
            suitcase.printThings();
        }
    }
}
