package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class Clerk extends Employees {
    public Clerk(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object managementAC (Object accountingCard){
        return accountingCard;
    }
}