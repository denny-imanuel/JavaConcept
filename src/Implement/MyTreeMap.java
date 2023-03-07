package Implement;

import java.util.Set;
import java.util.TreeSet;

// implement your own tree map in java
public class MyTreeMap<K,V> {
    public static class Pair<K,V> {
        private K key;
        private V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Set<Pair<K,V>> pairs;

    public MyTreeMap() {
        pairs = new TreeSet<Pair<K,V>>();
    }

    private V get(K key) {
        V value=null;
        for(var pair: pairs) {
            if (pair.key == key) {
                value = pair.value;
            }
        }
        return value;
    }

    private void put(K key, V value) {
        // check for duplicated key
        var isContainKey = false;
        for (var pair : pairs) {
            if (pair.key == key)
                isContainKey = true;
        }
        if (!isContainKey) {
            var pair = new MyTreeMap.Pair<K, V>(key, value);
            pairs.add(pair);
        }
    }

    private void remove(K key) {
        for (var pair:pairs) {
            if (pair.key==key) {
                var value = pair.value;
                pairs.remove(new Pair<>(key, value));
            }
        }
    }


}
