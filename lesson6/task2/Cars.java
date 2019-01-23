package homework.lesson6.task2;

public class Cars extends GroundTransportation{
    public Cars(String goStr) {
        super(goStr);
    }
    private String transmission;
    private String typeOfDrive;
    public void putOnTheAlarm (Object signaling, Object car){

    }

    @Override
    public String toString() {
        return "Легковой автомобиль - 'Тайота'";
    }
}
