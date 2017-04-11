import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mark Cunanan on 2/5/2017.
 */
public class RingingCentre {
    private Map<Bird, List<String>> birdListMap;
    public RingingCentre() {
        this.birdListMap = new HashMap<>();
    }

    public void observe(Bird bird, String place) {
        if (!birdListMap.containsKey(bird)) { //create new hashmap key and list
            this.birdListMap.put(bird, new ArrayList<>());
        }
        List<String> birdList = this.birdListMap.get(bird); //retreive list, add parameter (place)
        birdList.add(place);
    }

    public void observations(Bird bird) {
        List<String> oList = new ArrayList<>();
        for (Bird b : birdListMap.keySet()) { //iterate through the birdListMap keys
            List<String> bList = birdListMap.get(b);
            if (bird.equals(b)) { //increase counter if it contains key
                oList.addAll(bList);
            }
        }     System.out.println(bird + " observations: " + oList.size());
                 for (String i : oList){
                     System.out.println(i);
                 }
    }
}
