package homework.lesson8.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ServerAccessApp extends AccessLogger{

    public ServerAccessApp(LinkedList employees) {
        super(employees);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(01, "Ivan", "Ivanov", "Director"));
        employeeList.add(new Employee(02, "Kate", "Petrova", "Accountant"));
        employeeList.add(new Employee(03, "Semen", "Semenov", "DepartmentDirector"));
        employeeList.add(new Employee(04, "Anna", "Parshina", "Doctor"));
        employeeList.add(new Employee(05, "Sergey", "Sergeev", "Economist"));
        employeeList.add(new Employee(06, "Ivan", "Nikonov", "Ingenue"));
        employeeList.add(new Employee(07, "Viktor", "Ivanov", "Ingenue"));
        employeeList.add(new Employee(98, "Svetlana", "Semenova", "Lawyer"));
        employeeList.add(new Employee(99, "Pavel", "Sidorov", "Mechanic"));
        employeeList.add(new Employee(11, "Marina", "Mishina", "Typist"));

        AccessLogger accessLogger = new AccessLogger(new LinkedList());
        for (int i = 0; i < employeeList.size(); i++) {
            accessLogger.logAccess(employeeList.get(i));
            accessLogger.employees.add(employeeList.get(i));
        }
        for (int i = 2; i < employeeList.size(); i = i + 3) {
            accessLogger.logAccess(employeeList.get(i));
            accessLogger.employees.add(employeeList.get(i));
        }
        for (int i = accessLogger.getEmployees().size() - 1; i > accessLogger.getEmployees().size() - 6; i--) {
            System.out.println(accessLogger.getEmployees().get(i));
        }

    }
}
