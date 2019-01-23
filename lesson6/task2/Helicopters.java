package homework.lesson6.task2;
// Вертоеты
public class Helicopters extends  Aircraft{
    private int numberOfSeat; // Кол-во пассажиров
    private String screwLayout; // Схема расположения винтов

    public Helicopters(String goStr) {
        super(goStr);
    }

    @Override
    public String toString() {
        return "Вертолет - 'МИ - 24'";
    }
}
