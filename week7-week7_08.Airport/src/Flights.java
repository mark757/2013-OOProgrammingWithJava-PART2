import java.util.ArrayList;

/**
 * Created by Mark on 1/19/2017.
 */
public class Flights {
    private ArrayList<String> flights;
    public Flights(){
        this.flights = new ArrayList<>();
    }

    public void addFlight(String input){
        this.flights.add(input);
    }

    public String printFlight(){
        String flight = "";

        for (String string : flights){
            flight += string;
        }
        return flight;
    }

}
