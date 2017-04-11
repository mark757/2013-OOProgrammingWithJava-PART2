package application;

/**
 * Created by Mark Cunanan on 2/1/2017.
 */
public class ConstantSensor implements Sensor {
    private int measure;
    public ConstantSensor(int measure){
        this.measure = measure;
    }
    public int measure(){
        return this.measure;
    }
    public void on(){

    }
    public void off(){

    }
    public boolean isOn(){
        return true;
    }
}
