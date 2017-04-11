import java.io.File;
import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/2/2017.
 */
public class Printer {
    private String fileName;

    public Printer(String fileName) {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) throws Exception {
        File f = new File(this.fileName);
        Scanner reader = new Scanner(f);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }

        }

    }
}
