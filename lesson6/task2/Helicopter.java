package homework.lesson6.task2;
// Вертоеты
public class Helicopter extends  AirTransport{
    private int numberOfSeat; // Кол-во пассажиров
    private String screwLayout; // Схема расположения винтов

    public Helicopter(String goStr, String name) {
         super(goStr);
         setName(name);
    }

    @Override
    public String toString() {
        return "Вертолет - '" + getName()+ " '";
    }
}
