package homework.lesson11.task3.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new ElectricCar(0.0);
        Car car1 = new InternalCombustionCar(0.0);
        car.run();
        car.moveTo();
        car1.run();
        car1.moveTo();
    }
}
