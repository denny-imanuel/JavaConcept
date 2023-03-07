package Implement;
import java.util.HashSet;
import java.util.Set;

// implement your own hash map in java
public class MyHashMap<K,V> {
    public static class Pair<K, V> {
        private K key;
        private V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Set<Pair<K,V>> pairs = null;

    public MyHashMap() {
        this.pairs = new HashSet<Pair<K,V>>();
    }

    public void put(K key, V value) {
        // check for duplicated key
        var isContainKey = false;
        for (var pair : pairs) {
            if (pair.key == key)
                isContainKey = true;
        }
        if (!isContainKey) {
            var pair = new Pair<K, V>(key, value);
            pairs.add(pair);
        }
    }

    public void remove(K key) {
        for(var pair:pairs) {
            if (pair.key == key) {
                var val = pair.value;
                pairs.remove(new Pair<>(key, val));
            }
        }
    }

    public V get(K key) {
        V val = null;
        for(var pair: pairs) {
            if (pair.key == key)
                val = pair.value;
        }
        return val;
    }
}
