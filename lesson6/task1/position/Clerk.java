package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Clerk extends Employee {
    public Clerk(String name, String surname) {
        super(name, surname);
    }

    public Object managementAC (Object accountingCard){
        return accountingCard;
    }
}
