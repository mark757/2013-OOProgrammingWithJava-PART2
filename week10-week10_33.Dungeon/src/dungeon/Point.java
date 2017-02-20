package dungeon;

/**
 * Created by Mark Cunanan on 2/17/2017.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }



    protected int x(){
        return this.x;
    }

    protected int y(){
        return this.y;
    }
    protected String location(){
        return x + " " + y;
    }

    @Override
    public String toString(){
        return this.location();
    }
}
