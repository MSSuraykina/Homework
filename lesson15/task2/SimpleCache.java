package homework.lesson15.task2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SimpleCache implements Cache {

    private Map<Integer, Object> cacheMap;
    private int key;

    public SimpleCache() {
        this.cacheMap = new TreeMap<Integer, Object>();
        this.key = 1;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public Object get(Object key) {
        System.out.println(cacheMap.containsKey(key)?cacheMap.get(key):null);
        return cacheMap.containsKey(key)?cacheMap.get(key):null;
    }

    public Map getAll(Collection keys) {
        for (Map.Entry<Integer,Object> me:cacheMap.entrySet()) {
            Iterator<Integer> iterator = keys.iterator();
            while (iterator.hasNext()) {
                if (me.getKey().equals(iterator.next()))
                    System.out.println(" Ключ: " + me.getKey() + " значение: " + me.getValue());

            }
        }
        return cacheMap;
    }


    public void getAndRemove(Object key) {
        cacheMap.remove(key);
    }

    public void put(Object value) {
        cacheMap.put(key++,value);
       if (key > 100){
            cacheMap.remove(1);
            key = 1;
        }
    }

    public void clear() {
        cacheMap.clear();
    }

    public void containsKey(Object key) {
        System.out.println(cacheMap.containsKey(key));
    }
}
