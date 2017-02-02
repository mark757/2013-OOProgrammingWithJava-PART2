package file;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/2/2017.
 */
public class Analysis {
    private File file;
    private int numOfLines;
    public Analysis(File file) {
        this.file = file;
        this.numOfLines = numOfLines;
    }

    public int lines() throws Exception {
        Scanner reader = new Scanner(this.file);
        int numOfLines = 0;
        while (reader.hasNextLine()){
            reader.nextLine(); //read each line
            numOfLines++;
        }
        return numOfLines;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int counter = 0;
        int numOfLines = 0;
        while (reader.hasNextLine()){
            String string = reader.nextLine();
            numOfLines++;
            for (int i = 0; i < string.length(); i++){
                counter++;
            }
        } return counter + numOfLines;
    }
}
