package homework.lesson6.task1;

public class Department extends Baykonur {
    private String name;
    private Employee headOfDepartment;
    private Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

}
