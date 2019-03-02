package homework.lesson6.task2;

public class Coach extends RailwayTransport {
    public Coach(String goStr, String name){
        super(goStr);
        setName(name);

    }
    private int numberOfSeat;

    public void passengerTransportation(Object passenger){

    }

    @Override
    public String toString() {
        return "Пассажирский вагон - '" + getName()+ "'";
    }
}
