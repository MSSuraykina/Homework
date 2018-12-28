package homework.lesson4.task3;

public class TaskFromInterview {
    private static String s = "1";
    public static void main(String[] args) {
        try {
            testInt(1,1);//true число входит в прописанный кеш
             testInteger(new Integer(1), new Integer(1));//false создается два новых обьекта с разными ссылками и одним значением
             testInteger(127,127);// true число входит в прописанный кеш
             testInteger(1000,1000);// false число не входит в прописанный кеш
            // testInteger(new Integer(1), new Long(1));
             //testInteger(new  Integer(1), new String(s));
             testString(s,s);// true строкам присваивается одина ссылка указывающая на один обьект
             testString(s + "2", s + "2");//false т.к. создаются две новые строки
        } catch (Exception e){
            System.out.println("failure: "+ e);
        }
    }
    private static void testString(String o1, String o2){
        System.out.println(o1 == o2);
    }
    private static void testInteger(Integer o1, Integer o2){
        System.out.println(o1 == o2);
    }
    private static void testInt(int i1, int i2){
        System.out.println(i1 == i2);
    }
}
/** c 9 версии кеширование работает для new - обьектов
    размер кеша можно настроить вручную
    передав JVM необходимые параметры в конфигурации**/
