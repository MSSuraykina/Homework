package homework.lesson15.task2;

import java.util.Collection;
import java.util.Map;

public interface Cache<K,V> {

    public V get(K key);
    public Map<K,V> getAll(Collection<K> keys);
    public void getAndRemove(K key);
    public void put(V value);
    public void clear();
    public void containsKey(K key);
}
