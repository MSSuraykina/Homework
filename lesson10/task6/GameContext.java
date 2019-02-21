package homework.lesson10.task6;

public class GameContext {

    private IGame game;

    private Command cmd;

    public IGame getGame() {
        return game;
    }

    public void setGame(IGame game) {
        this.game = game;
    }

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return "GameContext{" +
                "game=" + game +
                ", cmd=" + cmd +
                '}';
    }
}