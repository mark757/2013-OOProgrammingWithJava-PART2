import java.util.*;

/**
 * Created by Mark on 1/28/2017.
 */

public class Tournament {
    private List<Jumper> jumpers;
    private Random random;

    public Tournament() {
        this.jumpers = new ArrayList<>();
        this.random = new Random();
    }

    public void addJumper(String name) {
        jumpers.add(new Jumper(name));
    }

    public void printJumpOrder() {
        Collections.sort(jumpers);
        int i = 1;
        System.out.println("Jumping order:");
        for (Jumper j : jumpers) {
            System.out.print("  " + i + ". " + j + "\n");
            i++;
        }
        System.out.println();
    }

    public void makeJump() {
        for (Jumper jumper : jumpers) {
            int randomLength = random.nextInt(120 - 60 + 1) + 60;
            jumper.addJump(randomLength);

            int[] tempVotes = new int[5];
            for (int i = 0; i < 5; i++) {
                int randomVote = random.nextInt(20 - 10 + 1) + 10;
                tempVotes[i] = randomVote;
            }
            jumper.setVotes(tempVotes);
        }
    }

    public void printJumpResult() {
        for (Jumper jumper : jumpers) {
            int length = jumper.getLength().get(jumper.getLength().size() - 1);
            String votes = Arrays.toString(jumper.getVotes());

            System.out.println("  " + jumper.getName() + "\n"
                                + "    length: " + length + "\n"
                                + "    judge votes: " + votes);
        }
        System.out.println();
    }

    public void updatePoints() {
        for (Jumper jumper : jumpers) {
            int index = jumper.getLength().size() - 1;
            int lastJumpLength = jumper.getLength().get(index);
            int[] votes = jumper.getVotes();

            Arrays.sort(votes);
            int pointsForJump = lastJumpLength + votes[1] + votes[2] + votes[3];
            jumper.setPoints(jumper.getPoints() + pointsForJump);
        }
    }

    public void printFinalResult() {
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        System.out.println("Position    Name");
        int i = 1;
        for (Jumper jumper : jumpers) {
            System.out.print(i + "           " + jumper + "\n");
            System.out.print("            jump lengths: ");
            for (Integer len : jumper.getLength()) {
                if (len == jumper.getLength().get(jumper.getLength().size() - 1))
                    System.out.print(len + " m");
                else
                    System.out.print(len + " m, ");
            }
            i++;
            System.out.println();
        }

    }
}