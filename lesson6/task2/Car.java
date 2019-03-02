package homework.lesson6.task2;

public class Car extends GroundTransportation{

    public Car(String goStr, String name) {
        super(goStr);
        setName(name);
    }
    private String transmission;
    private String typeOfDrive;
    public void putOnTheAlarm (Object signaling, Object car){

    }

    @Override
    public String toString() {
        return "Легковой автомобиль - ' " +getName() +" '";
    }
}
