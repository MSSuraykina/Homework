package homework.lesson10.task5;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    private static Map map = new TreeMap();//создание поля Map типа  HashMap

        public static void main(String[] args) {
            test(1,1);//size равен 1 т.к. ключи равны по значению
            test(10000,10000);//вывод равен 1 т.к. ключи равны и по значению
            test(new Integer(1),new Integer(1));//вывод равен 1 т.к. ключи равны и по значению и по типу
            /**
             * При добавлении строк в Map работает правило : если ключи равны, то новый обьект не создается а
             * переписывается первоначальное значение строки с данным ключом
             * и у нас остается 1 значение "B"
             */
            test(new Integer(1), new Long(1));//выдает ошибку невозможности отсортировать строки т.к они разного типа ;
            test(new Integer(1), new String("1"));//выдает ошибку невозможности отсортировать строки т.к они разного типа ;;
            test(new A(1), new A(1));//выдает ошибку невозможности отсортировать т.к не знает по какому правилу сортировать обьекты;
            /**
             * при создании Map типа TreeMap обьекты автоматически сортируюся по возрастанию их ключей
             * если отсортировать не получается то обьекты не могут быть добавленны
             * чтобы упорядочить обьекы по своему правилу можно переопредельть метод compareTo интерфейса Comparable
             */
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
