import java.util.HashMap;

/**
 * Created by Mark on 1/16/2017.
 */
public class PromissoryNote {
    private HashMap<String, Double> note = new HashMap<>();

    public PromissoryNote() {
        this.note = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        note.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.note.containsKey(whose)){
            return this.note.get(whose);
        }
        return 0;
    }

}
