package homework.lesson6.task1.departament;

import homework.lesson6.task1.Baykonur;
import homework.lesson6.task1.Department;
import homework.lesson6.task1.Employee;
import homework.lesson6.task1.position.DepartmentDirector;
import homework.lesson6.task1.position.Doctor_HW;
import homework.lesson6.task1.position.MedicalAssistant;
import homework.lesson6.task1.position.Psychologist;

public class HospitalWard extends Department {

    public HospitalWard(String name, Employee[] employees) {
        super(name, employees);
    }
}
