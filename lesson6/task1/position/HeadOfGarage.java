package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class HeadOfGarage extends Employee {
    public HeadOfGarage(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public boolean control(Object employee){

    return true;
    }
    public Object provisionOfSpareParts(){
        return "";
    }
    public Object provisionOfGSM(){
        return "";
    }
}
