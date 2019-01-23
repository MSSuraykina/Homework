package homework.lesson6.task5;

import java.util.List;

public class Sergeant extends Employee{
    public static void main(String[] args) {
        Employee employee = new Employee();
        Spy spy = new Spy();
        check(employee);
        check(spy);
    }
    public static void check (Human human) {
       // human = new Human();
        if ("BAIKONURE-E10".equals(human.getPassCard().getId()))
        {
            System.out.println("Проход разрешен");

        }
        else {
            System.out.println("Лови шпиона!");
        }


            }

}

