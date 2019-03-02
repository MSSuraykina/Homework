package homework.lesson6.task1.position;


import homework.lesson6.task1.Employee;

public class Accountant extends Employee {
    public Accountant(String name, String surname) {
        super(name, surname);
    }
    public double payment(double pay) {
        return pay;
    }

    public Object accounting(Object fixedAssets) {
        return fixedAssets;
    }

}
