package homework.lesson10.task6;

import java.util.*;

public class Game implements IGame {

    private static boolean isActive = true;
    private Scanner sc = new Scanner(System.in);
    private static Command cmd;



    public static Command getCmd() {
        return cmd;
    }
    public static void setCmd(Command cmd) {
        Game.cmd = cmd;
    }

    public void setIsActive(boolean isActive) {
        Game.isActive = isActive;
    }

    public static boolean isIsActive() {
        return isActive;
    }



    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.start();
    }

    @Override
    public void start() throws InterruptedException {
        GameContext ctx = new GameContext();
        ctx.setGame(this);
        ctx.setCmd(Command.GO);
        GameObject dwarf = new Dwarf(0,0);
        dwarf.init(0, 0, ctx);
        List<GameObject> ogres = new ArrayList<>(10);
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));
        ogres.add(new Ogre(0,0));

        for (GameObject ogre:ogres){
            ogre.init(5, 0, ctx);
        }
        while (isActive) {
            dwarf.update(ctx);
            ctx.setCmd(getNextCmd(dwarf, ogres));
            Thread.sleep(500);
        }

        dwarf.destroy();
    }

    @Override
    public void stop() {
        setIsActive(false);
    }

    public Command getNextCmd(GameObject dwarf, List<GameObject> ogres) {
        System.out.println("Enter Command: ");
        String rawCmd = sc.next().toUpperCase();
        System.out.println();
        if (!isIsActive() == false) {
            switch (rawCmd) {
                case "GO":
                    dwarf.go();
                    if (dwarf.getX() == 5) {
                        System.out.println("Вы подошли к каменным воротам Мории. \n" +
                                "Нужно ввести пароль. Для этого запомни третию простую команду:" +
                                "SAY: ввод текста с клавиатуры");

                    }
                    return Command.GO;
                case "BACK":
                    dwarf.back();
                    if (dwarf.getX() == 5) {
                        System.out.println("Вы подошли к каменным воротам Мории. \n" +
                                "Нужно ввести пароль. Для этого запомни третию простую команду:" +
                                "SAY: ввод текста с клавиатуры");
                    }
                    return Command.BACK;
                case "SAY":
                    System.out.println("Введите пароль:");
                    rawCmd = sc.next().toUpperCase();
                    dwarf.setSpeech(rawCmd);
                    dwarf.say();
                    return Command.SAY;
                case "EXIT":
                    System.out.println("Выход из игры");
                    setIsActive(false);
                    return Command.EXIT;
                case "ATTACK":
                    for (GameObject ogre:ogres) {
                        while (ogre.getLife() > 0) {
                            dwarf.attack(ogre);
                        }
                        if(ogre.getLife() <= 0){
                            System.out.println("ОРК УБИТ");
                        }
                        if (dwarf.getLife() <= 0 ){
                            setIsActive(false);
                            break;
                        }

                    }
                    }
                    System.out.println(dwarf.getLife());
                    return Command.ATTACK;

            }

        return null;
    }

}