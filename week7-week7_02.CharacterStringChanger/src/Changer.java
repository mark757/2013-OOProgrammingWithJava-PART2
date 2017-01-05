import java.util.ArrayList;

/**
 * Created by Mark on 1/4/2017.
 */
public class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
         for (Change string : changes){
             characterString = string.change(characterString); //using method from Change.java
         }
        return characterString;
    }

}
