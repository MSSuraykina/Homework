package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class Electrician extends Employees {
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
