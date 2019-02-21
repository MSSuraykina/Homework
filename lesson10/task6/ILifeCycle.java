package homework.lesson10.task6;

public interface ILifeCycle {
    void init(double x, double y, GameContext ctx);
    void update(GameContext ctx);
    void destroy();
}
