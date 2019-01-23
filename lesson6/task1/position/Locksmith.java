package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class Locksmith extends Employees {
    public Locksmith(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object locksmithsWork(Object object){
        return object;
    }
}
