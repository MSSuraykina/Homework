package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Locksmith extends Employee {
    public Locksmith(String name, String surname) {
        super(name, surname);
    }

    public Object locksmithsWork(Object object){
        return object;
    }
}
