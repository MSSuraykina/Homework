package homework.lesson10.task6;

import java.util.Objects;


public abstract class GameObject implements ILifeCycle, IFighting, IMove ,ISay{
    protected int x;
    protected int y;
    protected int life;
    protected String speech;



    public GameObject(int x, int y, int life) {
        this.x = x;
        this.y = y;
        this.life = life;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @Override
    public void attack(GameObject enemy) {
        int i = (int) (Math.random() * 10) + 1;
        if (i % 2 == 0) {
            enemy.calcDamage();
        } else {
            calcDamage();
        }
    }

    @Override
    public void calcDamage() {
        if (life >= 0) {
            int i = (int) (Math.random() * 10) + 1;//выдается случайное число от 1 до 100
            setLife(getLife() - i);
        }
    }

    @Override
    public void go() {
        System.out.println("Гном прошел на 1 шаг вправо");
        setX(getX() + 1);
        System.out.println(GameObject.this);
    }

    @Override
    public void back() {
        System.out.println("Гном прошел на 1 шаг влево");
        setX(getX() - 1);
        System.out.println(GameObject.this);
    }
    @Override
    public void say() {
        if ("ДРУГ".equals(getSpeech())) {
            System.out.println("ПАРОЛЬ ВЕРНЫЙ!!!ВРАТА ОТКРЫЛИСЬ!!!");
            System.out.println("На шум сбежались Орки. Нужно с ними сразиться.\n" +
                    "Для этого запоминай еще одну команду. \n" +
                    " ATTACK: нанести удар противнику\n" +
                    "P.S. НЕ ЗАБЫВАЙ СМОТРЕТЬ НА УРОВЕНЬ НАНЕСЕННОГО УРОНА");

        } else {
            System.out.println("ПАРОЛЬ НЕ ВЕРНЫЙ!!!ГНОМ УМЕР!!!");
            destroy();
        }
    }
    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ", speech='" + speech + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameObject that = (GameObject) o;
        return Objects.equals(speech, that.speech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speech);
    }
}