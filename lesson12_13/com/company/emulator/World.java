package homework.lesson12_13.com.company.emulator;

import homework.lesson12_13.com.company.engine.AbstractEngine;
import homework.lesson12_13.com.company.engine.IEngine;
import homework.lesson12_13.com.company.rocket.IRocket;
import homework.lesson12_13.com.company.rocket.SouzFG;
import homework.lesson12_13.com.company.stage.Block;
import homework.lesson12_13.com.company.stage.Stage;

import java.util.Set;


/**
 *
 */
public class World implements ILifeCycle {

    // Ссылка на объект конкретной ракеты существующей в нашем мире
    private IRocket rocket;
    private Set<Stage> stages;



    /**
     * Конструктор по умочанию
     * при использовании запускает инициализацию мира методом init()
     */
    public World() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Конструктор по умочанию
     * при использовании запоминает переданную ракету и
     * запускает инициализацию мира методом init()
     * @param rocket конкретная ракета
     */
    public World(IRocket rocket) {
        this.rocket = rocket;
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Блок геттеров/сеттеров
    public IRocket getRocket() {
        return rocket;
    }

    public void setRocket(IRocket rocket) {
        this.rocket = rocket;
    }
    // Имплементируем метод из интерфейса ILifeCycle для инициализации мира
    @Override
    public void init() throws Exception {
        if (rocket == null) { // если ракету не передали, то создаем ракету по умолчанию - Союз-ФГ
            rocket = SouzFG.make();


        }
        System.out.println("World was created");
    }

    // Имплементируем метод из интерфейса ILifeCycle для обновления мира
    // на каждой итерации. Т.е. именно тут и будет основная игровая логика.
    @Override
    public void update(GameContext ctx) throws Exception {
        System.out.println(ctx);

        switch (ctx.getCmd()) {
            case START: // обрабатываем команду старт
                System.out.println("Key on start!");
                for (int i = 5; i >= 1; i--){
                    System.out.print(i + "...");
                    Thread.sleep(1000);
                    if(i==1){
                        System.out.println("Пуск!");
                    }
                }
                rocket.start(); // передаем ракете команду старт
                break;
            case CANCEL: // обрабатываем команду отмена
                System.out.println("Star was canceled!!!");
                rocket.cancel(); // передаем ракете команду отмена
                ctx.getEmulator().setIsRunning(false); // берем из контекста эмулятор и останавливаем его
                break;
            case TELEMETRY:
            //FIXME: добавить обработку команды телеметрия
            // при получении команды получите:
            // - общее количество оставшихся ступеней (не отстыкованных)
            // - номер всех оставщихся ступеней
            // - состояние всех двигателей во всех оставшихся ступенях
                ;
                rocket.quantityOfNotUndockedStage();
                rocket.numberOfNotUndockedStage();
                rocket.engineCondition();



        }

    }

    // Имплементируем метод из интерфейса ILifeCycle для разрушения мира
    @Override
    public void destroy() throws Exception {
        rocket = null;
        System.out.println("World was dead!");
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return "World{" +
                "rocket=" + rocket +
                '}';
    }
}
