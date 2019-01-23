package homework.lesson6.task2;

public class Locomotives extends RailwayTransport{
    public Locomotives(String goStr) {
        super(goStr);
    }

    public void pullWagons(Object wagons){

    }

    @Override
    public String toString() {
        return "Локомотив - 'ЧМЭЗ РЖД'";
    }
}
