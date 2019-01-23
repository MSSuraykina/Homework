package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class DispensaryManager extends Employees {
    public DispensaryManager(Object position, String name, String surname) {
        super(position, name, surname);
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
