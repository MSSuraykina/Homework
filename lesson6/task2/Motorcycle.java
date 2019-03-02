package homework.lesson6.task2;

public class Motorcycle extends GroundTransportation{
    private int numberOfSeat;// одноместный или двухместный
    private String stroller; // наличае коляски

    public Motorcycle(String goStr, String name) {
        super(goStr);
        setName(name);
    }

    @Override
    public String toString() {
        return "Мотоцикл - '" + getName() +" '";
    }
}
