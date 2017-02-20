package dungeon;

/**
 * Created by Mark Cunanan on 2/17/2017.
 */
public class PlayerPoint extends Point {
    private String player;
    private int x;
    private int y;
    public PlayerPoint(int x, int y, String player) {
        super(x, y);
        this.player = player;
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getXPosition(){
        return this.x;
    }
    public int getYPosition(){
        return this.y;
    }
    @Override
    public String toString() {
        return this.player + " " + super.toString();
    }
}
