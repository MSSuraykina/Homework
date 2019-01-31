package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class Doctor_HW extends Employee {

    public Doctor_HW(Object position, String name, String surname) {
        super(position, name, surname);
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
