package homework.lesson15.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> keys = new ArrayList<Integer>();
        for (int i=70; i < 80; i++){
            keys.add(i);
        }


        SimpleCache stringCache = new SimpleCache();
        stringCache.put("one");
        stringCache.put("two");
        stringCache.put("three");
        stringCache.put("four");
        stringCache.containsKey(5);
        stringCache.get(3);
        stringCache.get(7);
        stringCache.clear();


        SimpleCache integerCache = new SimpleCache();
        for (Integer i = 1; i<150; i++) {
            integerCache.put(i);
        }
        integerCache.containsKey(23);
        integerCache.getAndRemove(5);
        integerCache.getAll(keys);
        integerCache.get(11);
        integerCache.get(135);

    }
}
