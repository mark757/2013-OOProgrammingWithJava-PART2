/**
 * Created by Mark on 1/20/2017.
 */
public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft){
       this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0){
            daysLeft--;
        }
    }
}
