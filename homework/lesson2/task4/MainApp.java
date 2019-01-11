package homework.lesson2.task4;

public class MainApp {
    public static void main(String[] args) {
        Printer my_printer = new Printer();
        my_printer.printString("Viva la Java!");
    }
    }

class Printer {
    public void printString(String my_str) {
        System.out.println(my_str);
    }
}