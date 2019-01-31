package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Economist extends Employee {
    public Economist(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public long calculationSP (long spaceProgram){
        return spaceProgram;
    }
    public long calculationCP (long price){
        return price;
    }
}
