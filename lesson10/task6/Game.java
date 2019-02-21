package homework.lesson10.task6;

import java.util.*;

public class Game implements IGame {

    private static boolean isActive = true;
    private static Command cmd;
    private Scanner sc = new Scanner(System.in);
    //private Collection<? extends Ogre> ogres;

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
    public void start() throws Exception {
        GameContext ctx = new GameContext();
        ctx.setGame(this);
        ctx.setCmd(Command.GO);
        Dwarf dwarf = new Dwarf();
        dwarf.init(0, 0, ctx);
        Set<Ogre> ogres = new HashSet<>(10);
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());
        ogres.add(new Ogre());

        for (Ogre ogre:ogres){
            ogre.init(5, 0, ctx);
        }
        while (isActive) {
            dwarf.update(ctx);
            ctx.setCmd(getNextCmd(dwarf,ogres));
            Thread.sleep(500);
        }

        dwarf.destroy();
    }

    @Override
    public void stop() {
        setIsActive(false);
    }

    public Command getNextCmd(Dwarf dwarf, Set<Ogre> ogres) {
        System.out.println("Enter Command: ");
        String rawCmd = sc.next();
        System.out.println();
        if (!isIsActive() == false) switch (rawCmd) {
            case "go":
                System.out.println("Гном прошел на 1 шаг вправо");
                dwarf.setX(dwarf.getX() + 1);
                System.out.println(dwarf);
                if (dwarf.getX() == 5) {
                    System.out.println("Вы подошли к каменным воротам Мории. \n" +
                            "Нужно ввести пароль. Для этого запомни третию простую команду:" +
                            "SAY: ввод текста с клавиатуры");
                }
                return Command.GO;
            case "back":
                System.out.println("Гном прошел на 1 шаг влево");
                dwarf.setX(dwarf.getX() - 1);
                System.out.println(dwarf);
                if (dwarf.getX() == 5) {
                    System.out.println("Вы подошли к каменным воротам Мории. \n" +
                            "Нужно ввести пароль. Для этого запомни третию простую команду:" +
                            "SAY: ввод текста с клавиатуры");
                }
                return Command.BACK;
            case "say":
                System.out.println("Введите пароль:");
                rawCmd = sc.next();
                dwarf.setSpeech(String.valueOf(dwarf.getSpeech().split(rawCmd)));
                if ("ДРУГ".equals(rawCmd)) {
                    System.out.println("ПАРОЛЬ ВЕРНЫЙ!!!ВРАТА ОТКРЫЛИСЬ!!!");
                    System.out.println("На шум сбежались Орки. Нужно с ними сразиться.\n" +
                            "Для этого запоминай еще одну команду. \n" +
                            " ATTACK: нанести удар противнику\n" +
                            "P.S. НЕ ЗАБЫВАЙ СМОТРЕТЬ НА УРОВЕНЬ НАНЕСЕННОГО УРОНА");

                } else {
                    System.out.println("ПАРОЛЬ НЕ ВЕРНЫЙ!!!ГНОМ УМЕР!!!");
                    setIsActive(false);
                }

                return Command.SAY;

            case "exit":
                System.out.println("Выход из игры");
                setIsActive(false);
                return Command.EXIT;
            case "ATTACK":
                for (Ogre ogre: ogres){
                    while (ogre.getLife()>0){
                        dwarf.attack(ogre);
                    }
                    if (dwarf.getLife() <= 0 ){
                        setIsActive(false);
                        break;
                    }
                    if(ogre.getLife() <= 0){
                        System.out.println("ОРК УБИТ");
                    }
                }
                System.out.println(dwarf.getLife());
                return Command.ATTACK;


            default:
                return null;

        }
        return null;
    }


}