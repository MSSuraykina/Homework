package homework.lesson11.task3.task4;

public class InternalCombustionCar extends Car {

    public InternalCombustionCar(double x) {
        super(x);
        super.setEngine(new InternalCombustionEngine());
    }
    @Override
    public void run() {
    super.engine.run();
    }
}
