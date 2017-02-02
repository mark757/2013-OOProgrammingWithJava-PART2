import application.AverageSensor;
import application.Sensor;
import application.Thermometer;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Mark Cunanan on 2/1/2017.
 */
public class Main {
    public static void main(String[] args) {
            Sensor kumpula = new Thermometer();
            Sensor kaisaniemi = new Thermometer();
            Sensor helsinkiVantaa = new Thermometer();

            AverageSensor helsinkiArea = new AverageSensor();
            helsinkiArea.addSensor(kumpula);
            helsinkiArea.addSensor(kaisaniemi);
            helsinkiArea.addSensor(helsinkiVantaa);

            helsinkiArea.on();
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

            System.out.println("readings: "+helsinkiArea.readings());

        }

}
