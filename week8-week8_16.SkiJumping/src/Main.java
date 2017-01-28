import java.util.Scanner;

/**
 * Created by Mark Cunanan on 1/28/2017.
 */

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        Tournament game = new Tournament();
        UserInterface ui = new UserInterface(game, reader);

        ui.startTournament();
    }
}