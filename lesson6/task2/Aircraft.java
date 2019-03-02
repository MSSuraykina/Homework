package homework.lesson6.task2;

public class Aircraft extends AirTransport{
    private int numberOfSeat; // Кол-во пассажиров
    private String enginesType; // Тип двигателя

    public Aircraft(String goStr, String name) {
        super(goStr);
        setName(name);
    }


    public void releaseChassis (){

    }
    public void removeChassis(){

    }
    public void putPassengers(Object passenger){

    }
    public void carryPassengers(Object passenger, String  routeSheet){

    }
    public void disembarkingPassengers(Object passenger){

    }

    @Override
    public String toString() {
        return "Самолет - '"+ getName()+ " '";
    }
}
