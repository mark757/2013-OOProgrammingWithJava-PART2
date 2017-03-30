package dictionary;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Test your dictionary here
        MindfulDictionary s = new MindfulDictionary("test/tmp/tmp27598.txt");
        s.add("tietokone", "computer");
        s.save();

    }
}
