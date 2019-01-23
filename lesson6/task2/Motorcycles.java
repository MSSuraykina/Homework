package homework.lesson6.task2;

public class Motorcycles extends GroundTransportation{
    private int numberOfSeat;// одноместный или двухместный
    private String stroller; // наличае коляски

    public Motorcycles(String goStr) {
        super(goStr);
    }

    @Override
    public String toString() {
        return "Мотоцикл - 'Урал'";
    }
}
