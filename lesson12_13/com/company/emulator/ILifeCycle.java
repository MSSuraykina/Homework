package homework.lesson12_13.com.company.emulator;

/**
 * Интерфейс описывающий общее поведение обектов
 * в нашем мире.
 */
public interface ILifeCycle {

    /**
     * Создание игрового объекта
     */
    void init() throws Exception;

    /**
     * Обновление статуса игрового объекта в игре
     */
    void update(GameContext ctx) throws Exception;

    /**
     * Разрушение объекта
     */
    void destroy() throws Exception;
}
