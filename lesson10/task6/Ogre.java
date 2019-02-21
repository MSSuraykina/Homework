package homework.lesson10.task6;

public class Ogre implements ILifeCycle, IFighting {
    private int x;
    private int y;



    private int life = 100;

    @Override
    public void attack(IFighting enemy) {
        int i = (int) (Math.random()* ++life)+1;
        if (i%2 == 0){
            enemy.calcDamage();
        }
        else {
            calcDamage();
        }
    }

    @Override
    public void calcDamage() {
        if (life>=0) {
            int i = (int) (Math.random()* ++life)+1;
            setLife(getLife() - i);
        }
        else {
            destroy();
        }
    }
    @Override
    public void init(double x, double y,GameContext ctx) {
        //System.out.println("Инициализация обьекта");
        setX(0);
        setY(0);
    }

    @Override
    public void update(GameContext ctx) {

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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
