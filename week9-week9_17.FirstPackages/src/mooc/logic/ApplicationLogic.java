package mooc.logic;

import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;

/**
 * Created by Mark Cunanan on 1/29/2017.
 */
public class ApplicationLogic {
            private UserInterface ui;
    public ApplicationLogic(UserInterface ui){
     this.ui = new TextUserInterface();
    }
    public void execute(int howManyTimes){
        int i = 0;
        while (i < howManyTimes) {
            System.out.println("The application logic works");
            i++;
            ui.update();

        }
    }
}
