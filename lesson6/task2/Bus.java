package homework.lesson6.task2;

public class Bus extends GroundTransportation {
    public Bus(String goStr, String name) {
        super(goStr);
        setName(name);

    }

    private int numberOfSeat;

    public void putPassengers(Object passenger){

    }
    public void carryPassengers(Object passenger, String  routeSheet){

    }
    public void disembarkingPassengers(Object passenger){

    }

    @Override
    public String toString() {
        return "Автобус - ' " + getName() + " '";
    }
}
