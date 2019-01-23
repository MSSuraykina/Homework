package homework.lesson6.task3;

import homework.lesson6.task2.Transport;

public class EngineStarting {
    public static void main(String[] args) {
        Transport airTransport = new Transport("Двигатель запущен и набрал обороты!");
        airTransport.runEngine();
        Transport groundTransport = new Transport("Автомобиль завелся!");
        groundTransport.runEngine();
        Transport spaceTransport = new Transport("Пуск успешен! Тяга в норме. ");
        spaceTransport.runEngine();
        Transport locomotive = new Transport("Дизель локомотив запущен!");
        locomotive.runEngine();

    }
}
