package homework.lesson10.task6;


public class Dwarf extends GameObject{

    public Dwarf(int x, int y) {
        super(x, y);
        this.x = 0;
        this.setSpeech("none");
        this.life = 100;
    }

    public void init(int x, int y, GameContext ctx) {
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
        setLife(100);
        System.out.println("Обновление обьекта" + toString());

    }

    @Override
    public void destroy() {
        setLife(0);
        System.out.println("Разрушение обьекта");
    }
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "x=" + x +
                ", y=" + y +
                ", life=" + life +
                ", speech='" + speech + '\'' +
                '}';
    }
}