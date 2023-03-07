package Implement;
import java.util.ArrayList;
import java.util.List;

// implement your own stack in java
public class MyStack<T> {

    private List<T> list;

    public MyStack() {
        list = new ArrayList<T>();
    }

    public void push(T item){
        list.add(item);
    }

    public T pop() {
        var idx = list.size();
        var val = list.get(idx-1);
        list.remove(idx-1);
        return val;
    }
}