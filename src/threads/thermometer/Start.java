package threads.thermometer;

public class Start {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer("Indoor", 15);
        Thread t1 = new Thread(thermometer);
        t1.start();
    }
}
