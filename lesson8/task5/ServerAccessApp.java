package homework.lesson8.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ServerAccessApp extends AccessLogger {

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
        employeeList.add(new Employee(111, "Alex", "Serov", "Doctor"));

        AccessLogger accessLogger = new AccessLogger();

        for (int i = 0; i < employeeList.size(); i++) {
            accessLogger.logAccess(employeeList.get(i));
        }
        for (int i = 1; i < employeeList.size(); i = i + 3) {
            accessLogger.logAccess(employeeList.get(i));
        }
        int index = accessLogger.getEmployees().size();
        ListIterator<Employee> listIterator = accessLogger.getEmployees().listIterator(index);
        int i = 0;

                while (listIterator.hasPrevious()) {
                    if(i<5){
                    System.out.println(listIterator.previous());
                i++;
            }
            else {
                break;
            }
        }


    }
}