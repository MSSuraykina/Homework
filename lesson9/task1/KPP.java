package homework.lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class KPP {
   List<Employee> employees = new ArrayList<>();

    public void logMove (Employee employee){
    getEmployees().add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
