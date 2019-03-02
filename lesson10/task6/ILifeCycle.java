package homework.lesson10.task6;

public interface ILifeCycle {
    void init(int x, int y, GameContext ctx);
    void update(GameContext ctx);
    void destroy();

}
