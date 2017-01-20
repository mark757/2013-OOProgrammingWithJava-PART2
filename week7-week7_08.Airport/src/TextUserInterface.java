import java.util.Scanner;

/**
 * Created by Mark on 1/17/2017.
 */
public class TextUserInterface {
    private Scanner reader;
    private Airport airport;
    private Flights flight;


    public TextUserInterface(Scanner reader, Airport airport, Flights flight) {
        this.reader = reader;
        this.airport = airport;
        this.flight = flight;
    }

    public void start() {
        boolean stop;

        System.out.println("Airport panel");
        System.out.println("--------------------");

        while (true) {
            menu();
            String option = reader.nextLine();

            if (option.equals("1")) {
                getPlane();
            } else if (option.equals("2")) {
                getFlight();

            } else if (option.equals("x")) {

                System.out.println("Flight service");
                System.out.println("--------------------");
                while (true) {
                    menu2();
                    option = reader.nextLine();

                    if (option.equals("x")) {
                        stop = true;
                        break;
                    } else if (option.equals("1")) {
                        printPlane();

                    } else if (option.equals("2")) {
                        printFlight();
                    } else if (option.equals("3")) {
                        printInfo();
                    }

                }
                if (stop) break;
            }
        }
    }

    public void menu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    public void getPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        String capacity = reader.nextLine();

        this.airport.addPlane(id, capacity);

    }

    public void getFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();

        String destinationAndArrival = airport.getPlane(id) + " (" + departure + "-" + destination + ")";

        flight.addFlight(destinationAndArrival);
    }

    public void menu2() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }

    public void printPlane() {
        System.out.println(airport.printPlanes());
    }

    public void printFlight() {
        System.out.println(flight.printFlight() + "YTET");
    }

    public void printInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println(airport.getInfo(id));
    }


}
