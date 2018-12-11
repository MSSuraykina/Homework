package Homework.lesson2.task1;

public class Main {
    public static String myMainQuestion(int answer){
        return ("Ответом на 'Главный вопрос жизни, \n"
                +"вселенной и всего такого' является число- "+answer);
    }
    public static void main(String[] args) {
        int answer = 42;
        System.out.println(myMainQuestion(answer));
    }
}
