package homework.lesson12_13.com.company.rocket;

import homework.lesson12_13.com.company.engine.RD0110;
import homework.lesson12_13.com.company.engine.RD107A;
import homework.lesson12_13.com.company.engine.RD108;
import homework.lesson12_13.com.company.stage.Block;
import homework.lesson12_13.com.company.stage.Stage;
import homework.lesson12_13.com.company.stage.StageType;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Ракетоноситель "Союз-ФГ"
 */
public class SouzFG implements IRocket {

    // набор ступеней ракетоносителя
    protected Set<Stage> stages = new HashSet<>();

    // конструктор по умолчанию
    private SouzFG() {

    }

    // конструктор принимающий заранее созданый набор ступеней
    public SouzFG(Set<Stage> stages) {
        this.stages = stages;
    }

    // Блок геттеров/сетторов
    public Set<Stage> getStages() {
        return stages;
    }

    public void setStages(Set<Stage> stages) {
        this.stages = stages;
    }

    // Имплементируем метод из интерфейса IRocket для обработки команды старт
    @Override
    public void start() {
        System.out.println("Starting...");
        startAllEngineOfStage(1);
    }

    // Имплементируем метод из интерфейса IRocket для обработки команды отмена
    @Override
    public void cancel() {
        System.out.println("Process was canceled!!!");
        for(Stage stage: this.stages){
            for(Block block: stage.getBlocks()){
                block.getEngine().stop();
            }
        }
    }

    // Имплементируем метод из интерфейса IRocket для обработки отстыковки ступени
    @Override
    public void unDocking(Stage stage) {
        System.out.println("Undocking stage:" + stage.getNumber());
        this.stages.remove(stage);
        startAllEngineOfStage(stage);
    }

    // Имплементируем метод из интерфейса IRocket для обработки стыковки со ступенью
    @Override
    public void addStage(Stage stage) {
        this.stages.add(stage);
        System.out.println("Stage added: " + stage);
    }

    // Метод сборки ракеты
    public static IRocket make(){
        IRocket rocket = new SouzFG(); // создаем пустую ракету

        Stage stage1 = new Stage(1, StageType.ACCELERATOR); // создаем ступень №1, тип - ускоритель
        Block blockA = new Block(new RD108(), "А"); // Добавляем блок - "А", он же участвует и в ступене №2,
                                                         // поэтому сохраним ссылку на него в переменной blockA
        stage1.addBlocks(blockA);
        stage1.addBlocks(new Block(new RD107A(), "Б")); // Добавляем блок - "Б", так называемую "морковку"
        stage1.addBlocks(new Block(new RD107A(), "В")); // Добавляем блок - "В", так называемую "морковку"
        stage1.addBlocks(new Block(new RD107A(), "Г")); // Добавляем блок - "Г", так называемую "морковку"
        stage1.addBlocks(new Block(new RD107A(), "Д")); // Добавляем блок - "Д", так называемую "морковку"

        rocket.addStage(stage1); // Добавляем в ракету ступень №1

        Stage stage2 = new Stage(2, StageType.ACCELERATOR); // создаем ступень №2, тип - ускоритель
        stage2.addBlocks(blockA); // Добавляем блок - "А" на ступень №2

        rocket.addStage(stage2); // Добавляем в ракету ступень №2

        Stage stage3 = new Stage(3, StageType.ACCELERATOR); // создаем ступень №3, тип - ускоритель
        stage3.addBlocks(new Block(new RD0110(), "И")); // Добавляем блок - "И" на ступень №3

        rocket.addStage(stage3); // Добавляем в ракету ступень №3

        Stage stage4 = new Stage(4, StageType.PAYMENT); // создаем ступень №4, тип - полезная нагрузка
        rocket.addStage(stage4); // Добавляем в ракету ступень №4

        return rocket;
    }

    // запускаем все двигатели ступени, передаем номер ступени
    // так называемый "синтаксический сахар", т.е. метод упрощающий написание кода
    private void startAllEngineOfStage(int numb) {
        startAllEngineOfStage(new Stage(numb-1, StageType.ACCELERATOR));
    }

    // запускаем все двигатели следующей ступени, передаем текущую ступень (от которой отстыковываемся)
    private void startAllEngineOfStage(Stage stage){
        System.out.println("Starting engine on stage:" + (stage.getNumber() + 1));
        for(Stage foundedStage: this.stages){
            if (foundedStage.getNumber() == stage.getNumber() + 1) {
                for(Block block: foundedStage.getBlocks()){
                    block.getEngine().start();
                }
                break;
            }
        }
    }
    @Override
    public Collection <Stage> getParts() {

        return getStages();
    }

    @Override
    public void engineCondition() {
        System.out.println("состояние всех двигателей :");
        for (Stage stage : stages) {
            for (Block block : stage.getBlocks()) {
                String condition = (block.getEngine().isStarted())?"двигатель включен":"двигатель выключен";
                System.out.println("Ступень - " + stage.getNumber() + " блок - " + block.getName() + " " + "двигатель - "
                        + block.getEngine().getClass().getSimpleName() + " - " + condition);
            }
        }
    }

    @Override
    public void numberOfNotUndockedStage() {
        System.out.println("Номера оставшихся ступеней: ");
        for (Stage stage: stages){
            System.out.print(stage.getNumber() + "; ");
        }
        System.out.println();// перевод каретки
    }

    @Override
    public void quantityOfNotUndockedStage() {
        System.out.println("Колличество оставшихся ступеней (не отстыковынных)" );
        int quantityStage = 0;
        for (Stage stage: stages){
           ++quantityStage;
        }
        System.out.println(quantityStage);
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return "SouzFG{" +
                "stages=" + stages +
                '}';
    }


}
