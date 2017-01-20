import java.util.Scanner;

/**
 * Created by Mark on 1/16/2017.
 */
public class TextUserInterface {
    private final Scanner reader;
    private final Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        startStatements();

        while (true) {
            System.out.print("Statement:");

            String statement = reader.nextLine().trim();

            if (statement.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;

            } else if (statement.equalsIgnoreCase("add")) {
                add();
            } else if (statement.equalsIgnoreCase("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }

        }

    }

    public void startStatements() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(word, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String key = dictionary.translate(word);
        System.out.print("Translation: " + key);
    }
}
