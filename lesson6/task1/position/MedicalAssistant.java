package homework.lesson6.task1.position;

import homework.lesson6.task1.Employee;

public class MedicalAssistant extends Employee {
    public MedicalAssistant(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public void helpDoctor(String task) {
    }

    public Object patientCare(Object patient) {
        return patient;
    }

    public Object dressing(Object patient) {
        return patient;
    }

    public Object procedures(Object patient) {
        return patient;
    }
}
