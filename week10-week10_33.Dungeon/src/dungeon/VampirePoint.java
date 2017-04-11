package dungeon;

/**
 * Created by Mark Cunanan on 2/17/2017.
 */
public class VampirePoint extends Point {
    private String vampire;
    public VampirePoint(int x, int y, String vampire) {
        super(x, y);
        this.vampire = vampire;
    }

    @Override
    protected String location() {
        return super.location();
    }

    @Override
    public String toString() {
        return this.vampire + " " + super.toString();
    }


}
