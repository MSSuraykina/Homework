package homework.lesson9.task1;

import java.util.HashSet;
import java.util.Set;

public class SdkApplication {
    public static void main(String[] args) {
        KPP kpp_1 = new KPP();
        KPP kpp_2 = new KPP();

        Employee employee_1 = new Employee(701,"Ivan","Shpak","Director");
        Employee employee_2 = new Employee(702, "Sergey","Mishin","Mechanic");
        Employee employee_3 = new Employee(703,"Artem","Aleshin","Lawyer");
        Employee employee_4 = new Employee(704,"Alex","Zuev","Electrician");
        Employee employee_5 = new Employee(705, "Elena","Serova","Accountant");

        kpp_1.logMove(employee_1);
        kpp_1.logMove(employee_2);
        kpp_1.logMove(employee_3);
        kpp_1.logMove(employee_2);

        kpp_2.logMove(employee_4);
        kpp_2.logMove(employee_5);

        getAllEmployeesInSpaceportNow(kpp_1);
        getAllEmployeesInSpaceportNow(kpp_2);

    }
    public static void getAllEmployeesInSpaceportNow(KPP kpp){

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.addAll(kpp.getEmployees());

        System.out.println(employeeSet);
    }
}
