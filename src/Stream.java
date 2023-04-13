import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

// how to use java stream to process collections. For multithreading stream take a look on ParallelStream
public class Stream {

    public void FilterList() {
        var list = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        var filtered = list.stream().filter(s -> s == "bbb").toList();
        System.out.println(list);
        System.out.println(filtered);
    }

    public void FilterDict() {
        var dict = new HashMap<Integer, String>();
        dict.put(1, "aaa");
        dict.put(2, "bbb");
        dict.put(3, "ccc");
        var bykey = dict.entrySet().stream().filter(e -> e.getKey() == 2).toList();
        var byval = dict.entrySet().stream().filter(e -> e.getValue() == "bbb").toList();
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    public void MapList() {
        var list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        var mapped = list.stream().map(i -> i*i).toList();
        System.out.println(list);
        System.out.println(mapped);
    }

    public void MapDict() {
        var dict = new HashMap<Integer, String>();
        dict.put(1, "a");
        dict.put(2, "b");
        dict.put(3, "c");
        var bykey = dict.entrySet().stream().map(e -> e.getKey() * e.getKey()).toList();
        var byval = dict.entrySet().stream().map(e -> e.getValue() + e.getValue()).toList();
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    public void CollectList() {
        var list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        var collected = list.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collected);
    }

    public void CollectDict() {
        var dict = new HashMap<Integer, String>();
        dict.put(1, "a");
        dict.put(2, "b");
        dict.put(3, "c");
        var bykey = dict.entrySet().stream().collect(Collectors.toMap(e->e.getKey()*e.getKey(), e->e.getValue()));
        var byval = dict.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()+e.getValue()));
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    public void StreamSorted() {
        var input = new ArrayList<Integer>(Arrays.asList(2, 4, 3, 5, 1));
        var asc = input.stream().sorted(Comparator.naturalOrder()).toList();
        var desc = input.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(input);
        System.out.println(asc);
        System.out.println(desc);
    }

    public void StreamDistinct() {
        var input = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3));
        var result = input.stream().distinct().collect(Collectors.toList());
        System.out.println(input);
        System.out.println(result);
    }

    public void ForEach() {
        var list = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        var dict = new HashMap<Integer, String>();
        dict.put(1, "aaa");
        dict.put(2, "bbb");
        dict.put(3, "ccc");
        dict.put(4, "ddd");
        dict.put(5, "eee");
        list.stream().forEach(s -> System.out.println(s));
        dict.entrySet().forEach(e -> System.out.println(e));
    }
}
