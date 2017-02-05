import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/3/2017.
 */
public class UserInterface {
    Information info = new Information();
    private Scanner reader;

    public UserInterface() {
     /*  String input = "1\n" + "pekka\n" + "040-123456\n"
                + "2\n" + "jukka\n"
                + "2\n" + "pekka\n"
                + "1\n" + "pekka\n" + "09-222333\n"
                + "2\n" + "pekka\n"
                + "3\n" + "02-444123\n"
                + "3\n" + "09-222333\n"
                + "5\n" + "pekka\n"
                + "4\n" + "pekka\n" + "ida ekaminitie\n" + "helsinki\n"
             + "5\n" + "pekka\n"
                + "4\n" + "jukka\n" + "korsontie\n" + "vantaa\n"
                + "5\n" + "jukka\n" + "7\n" + "kk\n"
                + "7\n" + "vantaa\n"
                + "7\n" + "seppo\n"
                + "6\n" + "jukka\n"
                + "5\n" + "jukka\n"
                 + "x\n";
        this.reader = new Scanner(input);  */
        this.reader = new Scanner(System.in);

    }

    public void start() {
        menu();

        while (true) {
            System.out.print("command: ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                System.out.print("whose number: ");
                String person = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                info.addNumber(person, number);

            } else if (command.equals("2")) {
                System.out.print("whose number: ");
                String person = reader.nextLine();
                info.searchNumberByPerson(person);

            } else if (command.equals("3")) {
                System.out.print("number: ");
                String number = reader.nextLine();
                info.searchPersonByNumber(number);

            } else if (command.equals("4")) {
                System.out.print("whose address: ");
                String person = reader.nextLine();
                System.out.print("street: ");
                String address = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                info.addAddress(person, address, city);

            } else if (command.equals("5")) {
                System.out.print("whose information: ");
                String person = reader.nextLine();
                info.searchInformation(person);

            } else if (command.equals("6")) {
                System.out.println("whose information: ");
                String person = reader.nextLine();
                info.deleteInformation(person);

            } else if (command.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String keyword = reader.nextLine();
                info.filter(keyword);

            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void menu() {
        System.out.println("phone search\n" + "available operations:");
        System.out.println(" 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

}
