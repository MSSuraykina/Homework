package homework.lesson6.task1.departament;

import homework.lesson6.task1.Baykonur;
import homework.lesson6.task1.Department;
import homework.lesson6.task1.Employee;
import homework.lesson6.task1.position.DriverOfCar;
import homework.lesson6.task1.position.HeadOfGarage;
import homework.lesson6.task1.position.Mechanic;

public class Garage extends Department {

    public Garage(String name, Employee[] employees) {
        super(name, employees);
    }
}
