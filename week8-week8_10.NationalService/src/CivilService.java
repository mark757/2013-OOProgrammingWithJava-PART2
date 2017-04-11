/**
 * Created by Mark on 1/20/2017.
 */
public class CivilService implements NationalService {
    private int daysLeft;
    public CivilService(){
        this.daysLeft = 362;
    }
    public int getDaysLeft(){
        return daysLeft;
    }
    public void work(){
        if (daysLeft > 0){
            daysLeft--;
        }
    }
}
