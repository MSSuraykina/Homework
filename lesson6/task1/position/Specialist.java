package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Specialist extends Employee {
    public Specialist(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object assemblyKA(Object ka) {
        return ka;
    }

    public Object assemblyPH(Object ph) {
        return ph;
    }
}
