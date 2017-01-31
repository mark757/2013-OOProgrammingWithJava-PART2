package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Cunanan on 1/29/2017.
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList();
    }

    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= this.maximumCapacity) {
            this.box.add(thing);
            return true;
        } else return false;
    }

    @Override
    public int getVolume() {
        int vol = 0;
        for (Thing i : this.box) {
            vol = vol + i.getVolume();
        }
        return vol;
    }

}
