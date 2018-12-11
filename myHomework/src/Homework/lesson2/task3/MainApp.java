package Homework.lesson2.task3;

import static java.lang.System.out;

public class MainApp {
    public static void main(String[] args) {
        String vive="Vive la Java!";
        int lenght=vive.length();
        char ch1=vive.charAt(0);
        char ch2=vive.charAt(lenght-2);
        char[] str = new char[]{ch1, ch2};
        out.println(vive);
        out.println(lenght);
        out.println(str);
        out.println(vive.subSequence(8,12));

    }
}
