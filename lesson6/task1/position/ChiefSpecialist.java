package homework.lesson6.task1.position;

import homework.lesson6.task1.Employees;

public class ChiefSpecialist extends Employees {
    public ChiefSpecialist(Object position, String name, String surname) {
        super(position, name, surname);
    }

    public boolean controlKA(Object ka) {
   return true; }

    public boolean controlPH(Object ph) {
    return true;}
}