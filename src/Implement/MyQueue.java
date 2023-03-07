package Implement;

import java.util.ArrayList;
import java.util.List;

// implement your own queue in java
public class MyQueue<T> {

    private List<T> list;

    public MyQueue() {
        list = new ArrayList<T>();
    }

    public void Enqueue(T item) {
        list.add(item);
    }

    public T Dequeue() {
        var idx = 0;
        var val = list.get(0);
        list.remove(0);
        return val;
    }

}
