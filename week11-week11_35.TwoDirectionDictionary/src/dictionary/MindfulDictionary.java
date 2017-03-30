package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by Mark Cunanan on 3/23/2017.
 */
public class MindfulDictionary {
    private HashMap<String, String> dict;
    private HashMap<String, String> dict2;
    private File file;
    private Scanner reader;
    private FileWriter writer;
    public MindfulDictionary() {
        this.dict = new HashMap<>();
    }


    public MindfulDictionary(String file) {
        this.file = new File(file);
        this.reader = new Scanner(file);
        this.dict = new HashMap<>();
        this.dict2 = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dict.containsKey(word)) {
            dict.put(word, translation);
        }
    }

    public String translate(String word) {
        try {
            if (dict.containsKey(word)) {
                for (String i : dict.keySet()) {
                    if (i.equals(word)) {
                        return dict.get(word);
                    }
                }

            } else if (dict.containsValue(word)) {
                for (String i : dict.keySet()) {
                    if (dict.get(i).equals(word)) {
                        return i;
                    }
                }
            }

        } catch (Exception e) {
        }
        return null;
    }

    public void remove(String word) {
        if (dict.containsKey(word)) {
            dict.remove(word);
        } else if (dict.containsValue(word)) {
            dict.remove(translate(word));
        }
    }

    public boolean load() {

        if (!file.exists()) {
            return false;
        }
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");
            String one = parts[0];
            String two = parts[1];
            this.dict.put(one, two);
        }
        return true;
    }

    public boolean save(){
        try {
            this.writer = new FileWriter(file);
            for (String a : this.dict.keySet()){
                String line = a + ":" + this.dict.get(a) + "\n";
                this.writer.write(line);
            }
            this.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }

}
