package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class DepartmentDirector extends Employee {
    public DepartmentDirector(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public boolean control (Object employees){
        return true;
    }
    public Object provisionPreparaty(){
        return "";
    }
    public Object provisionEquipment(){
        return "";
    }
}
