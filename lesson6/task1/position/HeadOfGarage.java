package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class HeadOfGarage extends Employee {
    public HeadOfGarage(String name, String surname) {
        super(name, surname);
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
