package homework.lesson3.task1;

public class MainApp {

    public static void main(String[] args) {
        String str="$ ";
        int rub=70;
        double course=1.6469;
        System.out.println(str+toUSD(rub,course));
    }

    public static double toUSD(int rub, double course) {
        return (rub*course);

    }
}