package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Electrician extends Employee {
    public Electrician(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object electricInstallationWork(Object object){
        return object;
    }
    public boolean setupAndLaunch (Object car){
        return true;
    }
}
