package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Typist extends Employee {
    public Typist(String name, String surname) {
        super(name, surname);
    }

    public String typing(String text) {
        return text;
    }
}
