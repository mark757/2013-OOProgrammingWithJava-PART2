package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Cunanan on 2/1/2017.
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    //private boolean toggle;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
       // this.toggle = true;
    }

    public void addSensor(Sensor additional) {
        //adds a new sensor to the AverageSensor
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor i : sensors) {
            if (!i.isOn()) {
                return false;
            }

        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : sensors) {
            if (s.isOn() == false) {
                s.on();
            }
        }

    }

    @Override
    public void off() {
        for (Sensor i : sensors) {
            i.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0;
        int average;
        for (Sensor i : sensors) {

            if (i.isOn() == false || i.equals(null)) {
                throw new IllegalStateException("Sensor is off or no sensor was found. ");
            }
            sum += i.measure();
        }

        average = sum / sensors.size();
        readings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return readings;
    }

}
