/**
 * Created by Mark on 1/4/2017.
 */
import java.lang.String;

public class Change {
    public char fromCharacter;
    public char toCharacter;

    //constructor
    public Change(char fromCharacter, char toCharacter){
        //create an object that makes changes from character fromCharacter to toCharacter
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        //returns the changed version of the given character string
        String change = characterString;
        change = change.replace(fromCharacter, toCharacter);
        return change;
    }


}
