package Homework.lesson1.task1;

public class MainApp {
    public static String runProgramLogic(String name){
        return ("Я-"+name+", обязуюсь:'\n"
                +"\t -прилежно комментировать свой код,\n"
                +"\t -не использовать goto, \n"
                + "\t -следить за состоянием потоков своих программ,\n"
                +"\t -контролировать выделение памяти.\n"
                +"\n"
                +"Я обязуюсь не оставлять мусора в системе.\n"
                +"и избегать однобуквенных переменных.\n"
                +"\t\t\t\t\t\t\t\tРесет.\n");
    }
    public static void main(String[] args) {
        String name="Марина";
        System.out.println(runProgramLogic(name));
    }
}
