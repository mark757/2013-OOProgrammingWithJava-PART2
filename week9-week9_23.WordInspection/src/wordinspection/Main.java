package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection s = new WordInspection( new File("src/wordList.txt") );
        s.wordCount();
        System.out.println(s.wordCount());
    }
}
