package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Clerk extends Employee {
    public Clerk(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public Object managementAC (Object accountingCard){
        return accountingCard;
    }
}
