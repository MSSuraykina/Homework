package homework.lesson6.task2;
// Грузовые выгоны
public class FreightCar extends RailwayTransport{

    public FreightCar(String goStr, String name) {
        super(goStr);
        setName(name);
    }

    @Override
    public String toString() {
        return "Грузовой вагон - 'НОВОТРАНС\n"
                + "Платформа транспортировки PH - 'B - 012''";
    }
}
