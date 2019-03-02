package homework.lesson11.task3.task4;

public class ElectricCar extends Car {

    public ElectricCar(double x) {
        super(x);
        super.setEngine(new ElectricEngine());
    }
    public void run() {
        super.engine.run();
    }
}
