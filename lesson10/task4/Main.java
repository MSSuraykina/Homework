package homework.lesson10.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map map = new HashMap<>();//создание поля Map типа  HashMap

    public static void main(String[] args) {
        test(1,1);//size равен 1 т.к. ключи равны по значению
        test(10000,10000);//вывод равен 1 т.к. ключи равны и по значению
        test(new Integer(1),new Integer(1));//вывод равен 1 т.к. ключи равны и по значению и по типу
        /**
         * При добавлении строк в Map работает правило : если ключи равны, то новый обьект не создается а
         * переписывается первоначальное значение строки с данным ключом
         * и у нас остается 1 значение "B"
         */
        test(new Integer(1), new Long(1));//вывод равен 2 т.к. ключи равны и по значению но не по типу и создается два значения map;
        test(new Integer(1), new String("1"));//вывод равен 2 т.к. ключи равны и по значению но не по типу и создается два значения map;
        test(new A(1), new A(1));//вывод равен 2 т.к. создается два разных обьекта с одним значением;
        testInt(1, 1); // число входит в прописанный кеш и у обоих обьектов будет один hashcode
        testInt(10000, 10000);
    }
    private static void test(Object o1, Object o2){//метод заполнение map таблицы
        try {//попробуй положить переданные обьекты в роли ключей, а строковое значение значением
            map.put(o1,"A");//заполнение map таблицы передача o1
            map.put(o2,"B");//заполнение map таблицы передача o2
            System.out.println(map.size());//вывод размера map таблицы
        }catch (Exception e){//поймай ошибку
            System.out.println("failure: " + e);// сделай вывод ошибки на терминал
        }finally {//в заключении
            map.clear();//очисти map таблицу
        }
    }
    private static void testInt(Integer i, Integer i2) {
        System.out.println(i);
        if (i == i2) System.out.println(" the same");
        if (i != i2) System.out.println(" different");
        if (i.equals(i2)) System.out.println(" equal");
    }

    static class A{//создание класса A
        private int value;// создание приватного поля value типа int

        public A(int value) {// конструктор класса
            this.value = value;
        }
// геттеры сеттеры
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
