import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 1/28/2017.
 */

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points = 0;
    private int[] votes = new int[5];
    private List<Integer> length = new ArrayList<>();

    public Jumper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Integer> getLength() {
        return length;
    }

    public int[] getVotes() {
        return votes;
    }

    public void setVotes(int[] votes) {
        this.votes = votes;
    }

    public void addJump(int lengths) {
        length.add(lengths);
    }

    public int compareTo(Jumper jumper) {
        return this.points - jumper.getPoints();
    }

    public String toString() {
        return name + " (" + points + " points)";
    }

}