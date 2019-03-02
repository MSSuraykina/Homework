package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class DispensaryManager extends Employee {
    public DispensaryManager(String name, String surname) {
        super(name, surname);
    }

    public boolean control(Object employee){
        return true;
    }
    public Object provisionPreparaty(){
        return "";
    }
    public Object provisionEquipment(){
        return "";
    }
}
