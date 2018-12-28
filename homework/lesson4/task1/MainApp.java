package homework.lesson4.task1;

public class MainApp {
    public static void main(String[] args) {
        String[] arrayA = {"Командир","Второй пилот","Инженер","Дублер1","Дублер2","Дублер3"};
        Astronaut myAstronaut_1;
        myAstronaut_1 = new Astronaut(75,180,52,76,76,80,42);
        Astronaut myAstronaut_2;
        myAstronaut_2 = new Astronaut(75,175,52,80,76,80,41);
        Astronaut myAstronaut_3;
        myAstronaut_3 = new Astronaut(70,177,54,82,80,80,43);
        Astronaut myAstronaut_4;
        myAstronaut_4 = new Astronaut(80,182,53,81,76,80,42);
        Astronaut myAstronaut_5;
        myAstronaut_5 = new Astronaut(73,172,51,76,70,74,41);
        Astronaut myAstronaut_6;
        myAstronaut_6 = new Astronaut(75,175,53,81,76,80,43);

        System.out.println(arrayA[0] + " "+myAstronaut_1 + "\n"
                + arrayA[1] + " " + myAstronaut_2 + "\n"
                + arrayA[2] + " " + myAstronaut_3 + "\n"
                + arrayA[3] + " " + myAstronaut_4 + "\n"
                + arrayA[4] + " " + myAstronaut_5 + "\n"
                + arrayA[5] + " " + myAstronaut_6);
        }
}
