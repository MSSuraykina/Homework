package homework.lesson10.task3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FiltrationSystem extends Text {

    public static void main(String[] args) {
        Text text = new Text();

        Map<String, Integer> callMap = new TreeMap<>();
        callMap.put("Заря", 0);
        callMap.put("Рубин", 0);

        String[] k = text.getText().split("\n");

        Set<Map.Entry<String, Integer>> set = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            for (int i = 0; i < k.length; i++) {
                if (k[i].contains("Заря:") & me.getKey().equals("Заря") ) {
                    me.setValue(me.getValue() + 1);
                }
                if (k[i].contains("Рубин:") & me.getKey().equals("Рубин")) {
                        me.setValue(me.getValue() + 1);
                    }
                }
            }
        System.out.println("Колличество вызовов:");
        Set<Map.Entry<String, Integer>> set_1 = callMap.entrySet();
        for (Map.Entry<String, Integer> me :set_1) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        Set<Map.Entry<String, Integer>> set_2 = callMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            me.setValue(0);
            for (int i = 0; i < text.getText().length()-5; i++) {
                String key1 = "заря";
                String key2 = "рубин";
                text.setText(text.getText().toLowerCase());

               if (text.getText().substring(i, i+key1.length()).equals(key1) & me.getKey().equals("Заря")){
                    me.setValue(me.getValue() + 1);
                    i += key1.length();
               }
                if (text.getText().substring(i, i+key2.length()).equals(key2) & me.getKey().equals("Рубин")){
                    me.setValue(me.getValue() + 1);
                    i += key2.length();
                }

            }
        }
        System.out.println("Сколько раз ключ встречается в тексте:");
        Set<Map.Entry<String, Integer>> set_4 = callMap.entrySet();
        for (Map.Entry<String, Integer> me :set_4) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }


    }

    }
