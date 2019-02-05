package homework.lesson8.task5;


import java.util.LinkedList;
import java.util.List;

public class AccessLogger {

    protected List<Employee> employees= new LinkedList<>();
    public AccessLogger(LinkedList employees) {
        this.employees = employees;

    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static void logAccess(Employee employee){
       List<Employee> employeeList = new LinkedList<>();
       employeeList.add(employee);
       //return (LinkedList) employeeList;

    }
}