package homework.lesson6.task2;

import java.awt.*;

public class Transport {

    private String name;
    private String fuel;   //тип топлива
    private double weight; //вес
    private Color color;
    private String number; //серийный номер
    private String goStr;

    public Transport(String goStr) {
        this.goStr = goStr;
    }

    public Transport() {
    }

    public void runEngine() {
        System.out.println(getGoStr());
    }

    public boolean technicalInspection() {
        return true;   //чтобы программа не выдавала ошибки
    }

    public String getGoStr() {
        return goStr;
    }

    public void setGoStr(String goStr) {
        this.goStr = goStr;
    }


}
