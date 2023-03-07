import java.util.*;
import java.util.stream.Collectors;

public class ParallelStream {
    public void FilterList() {
        var list = Collections.synchronizedList(new ArrayList<String>());
        list.addAll(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        var filtered = list.parallelStream().filter(s -> s == "bbb").toList();
        System.out.println(list);
        System.out.println(filtered);
    }

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

    public void MapList() {
        var list = Collections.synchronizedList(new ArrayList<Integer>());
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        var mapped = list.parallelStream().map(i -> i*i).toList();
        System.out.println(list);
        System.out.println(mapped);
    }

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

    public void CollectList() {
        var list = Collections.synchronizedList(new ArrayList<Integer>());
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        var collected = list.parallelStream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collected);
    }

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

    public void StreamSorted() {
        var input = Collections.synchronizedList(new ArrayList<Integer>());
        input.addAll(Arrays.asList(2, 4, 3, 5, 1));
        var asc = input.parallelStream().sorted(Comparator.naturalOrder()).toList();
        var desc = input.parallelStream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(input);
        System.out.println(asc);
        System.out.println(desc);
    }

    public void StreamDistinct() {
        var input = Collections.synchronizedList(new ArrayList<Integer>());
        input.addAll(Arrays.asList(1, 1, 2, 2, 3, 3));
        var result = input.parallelStream().distinct().collect(Collectors.toList());
        System.out.println(input);
        System.out.println(result);
    }

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
