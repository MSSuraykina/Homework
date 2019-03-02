package homework.lesson10.task6;

public class Ogre extends GameObject{


    public Ogre(int x, int y) {
        super(x, y);
        this.x = 5;
        this.y = 0;
        this.life = 5;
    }

    @Override
    public void init(int x, int y,GameContext ctx) {
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

}
