package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Cunanan on 1/29/2017.
 */
public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        //move things from thing list into boxes
        //boxes should be contained by the list the method returns
        List<Box> boxes = new ArrayList<>();
        Box box = new Box(boxesVolume);

        for (Thing i : things) {
            if (box.addThing(i)) { //if true, find all the possible items to pack and add them to box
                System.out.println("adding thing " + i + " into box");
            } else { //if false,
                boxes.add(box); //take all the items from box and at them to
                box = new Box(boxesVolume); //create a new box
                box.addThing(i); //if true, find all the possible items to pack
                boxes.add(box); ////add all the things found into the box
            }
        }
        return boxes;
    }


}
