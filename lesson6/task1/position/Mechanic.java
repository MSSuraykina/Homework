package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class Mechanic extends Employees {
    public Mechanic(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object repair (Object car){
        return car;
    }
    public boolean check (Object car){
        return true;}
}