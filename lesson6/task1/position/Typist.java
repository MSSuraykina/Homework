package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class Typist extends Employees {
    public Typist(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public String typing (String text){
        return text;
    }
}
