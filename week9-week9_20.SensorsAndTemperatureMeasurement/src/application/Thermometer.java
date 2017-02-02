package application;

import java.util.Random;

/**
 * Created by Mark Cunanan on 2/1/2017.
 */
public class Thermometer implements Sensor {
    private boolean toggle;

    public Thermometer(){
        this.toggle = false;
    }

    @Override
    public boolean isOn() {
        return this.toggle;

    }
    @Override
    public void on() {
        this.toggle = true;

    }

    @Override
    public void off() {
        this.toggle = false;
    }

    @Override
    public int measure() {
        if (isOn()) {
            Random random = new Random();
            int randNum = random.nextInt(30 - (-30) + 1) + (-30);
            return randNum;
        }
            throw new IllegalStateException("Thermometer is off. ");
    }
}
