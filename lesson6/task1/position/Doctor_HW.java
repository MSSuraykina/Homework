package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Doctor_HW extends Employee {

    public Doctor_HW(String name, String surname) {
        super(name, surname);
    }

    public String diagnosis(Object patient) {
        return "";
    }

    public boolean treatmentControl(Object patient) {
        return true;
    }

    public String writingCaseHistory(String diagnosis) {
        return "";
    }
}
