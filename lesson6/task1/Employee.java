package homework.lesson6.task1;

import java.util.Objects;

public class Employee {
    private Object position;
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Employee(Object position, String name, String surname) {
        this.position = position;
        this.name = name;
        this.surname = surname;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

