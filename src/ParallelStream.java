import java.util.*;
import java.util.stream.Collectors;

// this class explains how to use parallel stream in java to process synchronized collections
public class ParallelStream {

    // how to use filter function on parallel stream to filter out list item based on an equality criteria
    public void FilterList() {
        var list = Collections.synchronizedList(new ArrayList<String>());
        list.addAll(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        var filtered = list.parallelStream().filter(s -> s == "bbb").toList();
        System.out.println(list);
        System.out.println(filtered);
    }

    // how to use filter function on parallel stream to filter out hashmap key/value based on an equality criteria
    public void FilterDict() {
        var dict = Collections.synchronizedMap(new HashMap<Integer, String>());
        dict.put(1, "aaa");
        dict.put(2, "bbb");
        dict.put(3, "ccc");
        var bykey = dict.entrySet().parallelStream().filter(e -> e.getKey() == 2).toList();
        var byval = dict.entrySet().parallelStream().filter(e -> e.getValue() == "bbb").toList();
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    // how to use map function on parallel stream to manipulate list item to calculate/process the data
    public void MapList() {
        var list = Collections.synchronizedList(new ArrayList<Integer>());
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        var mapped = list.parallelStream().map(i -> i*i).toList();
        System.out.println(list);
        System.out.println(mapped);
    }

    // how to use map function on parallel stream to manipulate hashmap key/value to calculate/process the data
    public void MapDict() {
        var dict = Collections.synchronizedMap(new HashMap<Integer, String>());
        dict.put(1, "a");
        dict.put(2, "b");
        dict.put(3, "c");
        var bykey = dict.entrySet().parallelStream().map(e -> e.getKey() * e.getKey()).toList();
        var byval = dict.entrySet().parallelStream().map(e -> e.getValue() + e.getValue()).toList();
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    // how to use collect function on parallel stream to convert it to another list format
    public void CollectList() {
        var list = Collections.synchronizedList(new ArrayList<Integer>());
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        var collected = list.parallelStream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collected);
    }

    // how to use collect function on parallel stream to convert it to another hashmap format
    public void CollectDict() {
        var dict = Collections.synchronizedMap(new HashMap<Integer, String>());
        dict.put(1, "a");
        dict.put(2, "b");
        dict.put(3, "c");
        var bykey = dict.entrySet().parallelStream().collect(Collectors.toMap(e->e.getKey()*e.getKey(), e->e.getValue()));
        var byval = dict.entrySet().parallelStream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()+e.getValue()));
        System.out.println(dict);
        System.out.println(bykey);
        System.out.println(byval);
    }

    // how to use sorted function on parallel stream to sort the item within a list
    public void StreamSorted() {
        var input = Collections.synchronizedList(new ArrayList<Integer>());
        input.addAll(Arrays.asList(2, 4, 3, 5, 1));
        var asc = input.parallelStream().sorted(Comparator.naturalOrder()).toList();
        var desc = input.parallelStream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(input);
        System.out.println(asc);
        System.out.println(desc);
    }

    // how to use distinct function on parallel stream to find distinct value within list
    public void StreamDistinct() {
        var input = Collections.synchronizedList(new ArrayList<Integer>());
        input.addAll(Arrays.asList(1, 1, 2, 2, 3, 3));
        var result = input.parallelStream().distinct().collect(Collectors.toList());
        System.out.println(input);
        System.out.println(result);
    }

    // how to use foreach function to loop over item within the list and hashmap
    public void ForEach() {
        var list = Collections.synchronizedList(new ArrayList<String>());
        list.addAll(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        var dict = Collections.synchronizedMap(new HashMap<>());
        dict.put(1, "aaa");
        dict.put(2, "bbb");
        dict.put(3, "ccc");
        dict.put(4, "ddd");
        dict.put(5, "eee");
        list.parallelStream().forEach(s -> System.out.println(s));
        dict.entrySet().parallelStream().forEach(e -> System.out.println(e));
    }
}
