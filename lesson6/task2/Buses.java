package homework.lesson6.task2;

public class Buses extends GroundTransportation {
    public Buses(String goStr) {
        super(goStr);
        this.numberOfSeat = numberOfSeat;
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
        return "Автобус - 'Икарус'";
    }
}
