package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/2/2017.
 */
public class WordInspection {
    private File file;

    public WordInspection(File file) throws Exception {
        this.file = file;
    }

    public int wordCount() throws Exception {
        int counter = 0;
        Scanner r = new Scanner(file);

        while (r.hasNextLine()) {
            counter++;
            r.nextLine();
        }

        return counter;
    }

    public List<String> wordsContainingZ() throws Exception {
        Scanner z = new Scanner(file);
        List<String> listOfZWords = new ArrayList<>();

        while (z.hasNextLine()) {
            String hasZ = z.nextLine();
            if (hasZ.contains("z")) {
                listOfZWords.add(hasZ);
            }
        }
        return listOfZWords;
    }

    public List<String> wordsEndingInL() throws Exception {
        Scanner l = new Scanner(file);
        List<String> listOfWordsEndingInL = new ArrayList<>();

        while (l.hasNextLine()) {
            String wordEndsWithL = l.nextLine();
            if (wordEndsWithL.endsWith("l")) {
                listOfWordsEndingInL.add(wordEndsWithL);
            }
        }
        return listOfWordsEndingInL;
    }

    public List<String> palindromes() throws Exception {
        Scanner p = new Scanner(file);
        List<String> listOfPalindromes = new ArrayList<>();

        while (p.hasNextLine()) {
            String pal = p.nextLine();
            String lap = "";
            int palLength = pal.length();
            for (int i = palLength - 1; i >= 0; i--) {
                lap = lap + pal.charAt(i);
            }
            if (pal.equals(lap)) {
                listOfPalindromes.add(pal);
            }


            /* for (int i = 0; i < (palLength/2); ++i){
                if (pal.charAt(i) == pal.charAt(palLength - i - 1)){
                 istOfPalindromes.add(pal);
                    }
            }*/

        }
        return listOfPalindromes;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        Scanner v = new Scanner(file);
        List<String> listOfWordsWithVowels = new ArrayList<>();
        while (v.hasNextLine()) {
            String vw = v.nextLine();
            if (vw.contains("a") & vw.contains("e") & vw.contains("i") & vw.contains("o") & vw.contains("u") & vw.contains("y") & vw.contains("ä") & vw.contains("ö")) {
                listOfWordsWithVowels.add(vw);
            }
        }
        return listOfWordsWithVowels;
    }


}
