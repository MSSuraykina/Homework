package homework.lesson6.task1;

import java.util.Objects;

public abstract class Employee {
    private Object position;
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Employee( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    void goThroughTheGate(){}// пройти через проходную

    void showPass(Object pass){}// предъявить пропуск

    void getSalary (){} //получить з/п

    void goToTheHospital(){} // уйти на больничный

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

