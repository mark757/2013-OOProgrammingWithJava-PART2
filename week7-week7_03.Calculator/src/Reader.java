import java.util.Scanner;

/**
 * Created by Mark on 1/5/2017.
 */
public class Reader {
    private Scanner scanner;

    public Reader() {
      scanner = new Scanner(System.in);
    }

    public String readString() {
        String command = scanner.nextLine();
       // System.out.println(number );
        return command;
    }

    public int readInteger() {
        int integer = Integer.parseInt(scanner.nextLine());
        //System.out.println(integer);
        return integer;
    }
}
