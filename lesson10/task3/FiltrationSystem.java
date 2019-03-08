package homework.lesson10.task3;

import java.util.Map;
import java.util.TreeMap;

public class FiltrationSystem extends Text {

    public static void main(String[] args) {
        Text text = new Text();

        Map<String, Integer> callMap = new TreeMap<>();

        String[] k = text.getText().split("\n");

        for (int i = 0; i < k.length; i++) {
            if (k[i].contains("Заря:")) {
                callMap.put("Заря:", callMap.containsKey("Заря:") ? callMap.get("Заря:")+1 : 1 );
            }
            if (k[i].contains("Рубин:")) {
                callMap.put("Рубин:", callMap.containsKey("Рубин:") ? callMap.get("Рубин:")+1 : 1 );
            }
        }

        for (int i = 0; i < text.getText().length()-5; i++) {
            String key1 = "Заря";
            String key2 = "Рубин";
            if (text.getText().substring(i, i+key1.length()).equals(key1)) {
                callMap.put("Заря", callMap.containsKey("Заря") ? callMap.get("Заря")+1 : 1 );
            }
            if (text.getText().substring(i, i+key2.length()).equals(key2)) {
                callMap.put("Рубин", callMap.containsKey("Рубин") ? callMap.get("Рубин")+1 : 1);
            }
        }
        for (Map.Entry<String, Integer> me : callMap.entrySet()){
            switch (me.getKey()){
                case "Заря:":
                    System.out.println("ЦУП вызывал космонавта - "+me.getValue()+ " раз");
                    break;
                case "Рубин:":
                    System.out.println("Космонавт ответил ЦУП - "+me.getValue()+ " раз");
                    break;
                case "Заря":
                    System.out.println("Слово 'Заря' встречалось в тексте - "+me.getValue()+ " раз");
                    break;
                case "Рубин":
                    System.out.println("Слово 'Рубин' встречалось в тексте -  - "+me.getValue()+ " раз");
                    break;
                default: break;
            }
        }

}
}
