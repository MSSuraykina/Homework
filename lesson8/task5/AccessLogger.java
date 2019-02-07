package homework.lesson8.task5;

import java.util.LinkedList;

public class AccessLogger {

    private LinkedList<Employee> employees= new LinkedList<>();

    public AccessLogger() {
        this.employees = employees;

    }
    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    public void logAccess(Employee employee){
       getEmployees().add(employee);

    }
}