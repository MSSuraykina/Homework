package homework.lesson6.task1;

import java.util.Objects;

public class Employees {
    private Object position;
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Employees(Object position, String name, String surname) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return age == employees.age &&
                Objects.equals(position, employees.position) &&
                Objects.equals(name, employees.name) &&
                Objects.equals(surname, employees.surname) &&
                Objects.equals(gender, employees.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name, surname, gender, age);
    }
}
