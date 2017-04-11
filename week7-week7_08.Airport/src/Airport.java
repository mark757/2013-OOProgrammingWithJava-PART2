import java.util.HashMap;

/**
 * Created by Mark on 1/17/2017.
 */
public class Airport {
    private HashMap<String, String> planes;

    public Airport() {
        this.planes = new HashMap<>();
    }

    public void addPlane(String id, String capacity) {
        planes.put(id, capacity);
    }

    public String getPlane(String id){
        return id + " (" + this.planes.get(id)+ " ppl)";
    }

    public String printPlanes() {
        String plane = "";
        for (String key : planes.keySet()) {
            String capacity = this.planes.get(key);

            plane += key + " (" + capacity + " ppl)\n";
        }
        return plane;
    }

    public String getInfo(String id){
        String info = "";
        for (String key : planes.keySet()){
            if (id.equals(key)){
                info = id + " (" + planes.get(id) + " ppl)\n"; ;
            }
        } return info;
    }

}