/**
 * Created by Mark on 1/5/2017.
 */
public class Calculator {
    private Reader reader = new Reader();
    private int counter = 0;

    public Calculator() {
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                counter++;
                sum();
            } else if (command.equals("difference")) {
                counter++;
                difference();
            } else if (command.equals("product")) {
                counter++;
                product();
            }
        }
        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        System.out.println("sum of the values " + (value1 + value2));
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        System.out.println("difference of the values " + (value1 - value2));
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        System.out.println("product of the values " + (value1 * value2));
    }

    private void statistics() {
        System.out.println("Calculations done " + counter);
    }

}
