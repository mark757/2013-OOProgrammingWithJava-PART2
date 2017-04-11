import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mark on 1/16/2017.
 */
public class Dictionary {
    private final HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<>();
        for (String key : this.dictionary.keySet()) {
            String value = this.dictionary.get(key);

            String addToList = key + " = " + value;
            translationList.add(addToList);

        }
        return translationList;
    }

}
