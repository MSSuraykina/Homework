package homework.lesson6.task2;

public class Locomotive extends RailwayTransport{
    public Locomotive(String goStr, String name) {
        super(goStr);
        setName(name);
    }
    public void pullWagons(Object wagons){

    }
    @Override
    public String toString() {
        return "Локомотив - '" + getName() + "'";
    }
}
