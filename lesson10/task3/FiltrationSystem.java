package homework.lesson10.task3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FiltrationSystem extends Text{

    public static void main(String[] args) {
        Text text = new Text();

        Map<String,Integer> callMap = new TreeMap<>();
        callMap.putIfAbsent("Заря",0);
        callMap.putIfAbsent("Рубин",0);

        Set<Map.Entry<String, Integer>> set = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            for (int i = 0; i <text.getText().length(); i++) {
                if ((text.getText().toLowerCase().charAt(i) == 'з')
                        && (text.getText().toLowerCase().charAt(++i) == 'а')
                        && (text.getText().toLowerCase().charAt(++i) == 'р')
                        && (text.getText().toLowerCase().charAt(++i) == 'я'
                        && (text.getText().toLowerCase().charAt(++i) == ':'))) {
                    String str_1 = "Заря";
                    if (me.getKey().equals(str_1)) {
                        me.setValue(me.getValue() + 1);
                    }
                }
            }
            for (int i = 0; i <text.getText().length(); i++) {
                if ((text.getText().toLowerCase().charAt(i)=='р')
                        &&  (text.getText().toLowerCase().charAt(++i)=='у')
                        && (text.getText().toLowerCase().charAt(++i)== 'б')
                        && (text.getText().toLowerCase().charAt(++i) =='и')
                        && (text.getText().toLowerCase().charAt(++i) =='н')
                        && (text.getText().toLowerCase().charAt(++i) ==':')){
                    String str_2="Рубин";
                    if (me.getKey().equals(str_2)){
                        me.setValue(me.getValue()+1);
                            }
                        }
            }
            }
        System.out.println("Количество вызовов:");
        Set<Map.Entry<String, Integer>> set_1 = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set_1) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        Set<Map.Entry<String, Integer>> set_2 = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            me.setValue(0);
            for (int i = 0; i <text.getText().length(); i++) {
                if ((text.getText().toLowerCase().charAt(i) == 'з')
                        && (text.getText().toLowerCase().charAt(++i) == 'а')
                        && (text.getText().toLowerCase().charAt(++i) == 'р')
                        && (text.getText().toLowerCase().charAt(++i) == 'я')) {
                    String str_1 = "Заря";
                    if (me.getKey().equals(str_1)) {
                        me.setValue(me.getValue() + 1);
                    }
                }
            }
            for (int i = 0; i <text.getText().length(); i++) {
                if ((text.getText().toLowerCase().charAt(i)=='р')
                        &&  (text.getText().toLowerCase().charAt(++i)=='у')
                        && (text.getText().toLowerCase().charAt(++i)== 'б')
                        && (text.getText().toLowerCase().charAt(++i) =='и')
                        && (text.getText().toLowerCase().charAt(++i) =='н')) {
                    String str_2="Рубин";
                    if (me.getKey().equals(str_2)){
                        me.setValue(me.getValue()+1);
                    }
                }
            }
        }
        System.out.println("Ключ встречается в тексте:");
        Set<Map.Entry<String, Integer>> set_4 = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set_1) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }

}
