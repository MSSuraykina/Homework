package homework.lesson10.task6;

import java.util.Random;

public class Dwarf implements ILifeCycle ,IFighting{

    private int x;
    private int y;
    private String speech;
    private  int life = 100;

    public Dwarf(){

    }

    public Dwarf(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dwarf(int x, int y, String speech) {
        this.x = x;
        this.y = y;
        this.speech = speech;
    }


    @Override
    public void init(double x, double y, GameContext ctx) {
        System.out.println("Инициализация обьекта");
        System.out.println("Здравствуйте дорогой друг!Нам предстоит долгий и интересный путь! \n" +
                "Вы находитись в сказочном лесу, который полнон загадок и опасностей!\n" +
                "Для начала давай осмотримся по сторонам, для этого тебе необходимо запомнить две простые команды:\n" +
                "GO : движение вправо на один шаг;\n" +
                "BACK : движение вверх на один шаг");
        System.out.println("Вот тебе 1 задание: пройти на 5 шагов вправо");
      setX(0);
      setY(0);
    }

    @Override
    public void update(GameContext ctx) {
        //System.out.println("Обновление обьекта");
        //setX(0);
        //setY(0);
        setSpeech("none");
    }

    @Override
    public void destroy() {
        System.out.println("Разрушение обьекта");

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "x=" + x +
                ", y=" + y +
                ", speech='" + speech + '\'' +
                '}';
    }

    @Override
    public void attack(IFighting enemy) {
        int i = (int) (Math.random()* ++life)+1;
        if (i%2 == 0){
            enemy.calcDamage();
            System.out.println("Точно в цель:)");
        }
        else {
           calcDamage();
           System.out.println("Промах:(");
        }
    }

    @Override
    public void calcDamage() {

       if (life>=0) {
           int i = (int) (Math.random()* ++life)+1;//выдается случайное число от 1 до 100
           setLife(getLife() - i);
       }
       else {

           destroy();
       }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}