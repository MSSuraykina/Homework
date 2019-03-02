package homework.lesson11.task3.task4;

public abstract class Car implements IMove {

    private double x;

    protected IEngine engine;

    public Car(double x) {
        this.x = x;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void moveTo() {
        x++;
        System.out.println(x);
    }

}
