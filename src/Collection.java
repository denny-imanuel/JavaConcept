import java.util.*;

// this class describe how to use java collections
public class Collection {

    // how to loop a string in java
    public void LoopString() {
        var str = "abcde";
        var chars = str.toCharArray();
        for (var chr:chars) {
            System.out.println(chr);
        }
    }

    // how to loop an array in java
    public void LoopArray() {
        var arr = new int[] {1,2,3,4,5};
        for (var itm: arr) {
            System.out.println(itm);
        }
    }

    // how to loop a list in java
    public void LoopList() {
        var list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        for (var itm: list) {
            System.out.println(itm);
        }
    }

    // how to loop sorted list in java. Java doesn't have SortedList and TreeList. You can use Collections.sort().
    public void LoopTreeList() {
        var list = new ArrayList<Integer>(Arrays.asList(4,5,2,1,3));
        Collections.sort(list);                                     // asc
        Collections.sort(list, Collections.reverseOrder());         // desc
        for (var itm: list) {
            System.out.println(itm);
        }
    }

    // how to loop a set in java
    public void LoopHashSet() {
        var set = new HashSet<Integer>(Arrays.asList(1,1,2,2,3,3));
        for (var itm: set) {
            System.out.println(itm);
        }
    }

    // how to loop a sorted set in java. SortedSet is interface while TreeSet is concrete class
    public void LoopTreeSet() {
        var aset = new TreeSet<Integer>(Arrays.asList(5,4,3,2,1));  // asc
        var dset = aset.descendingSet();                            // desc
        for (var itm: aset) {
            System.out.println(itm);
        }
    }

    public void LoopHashMap() {
        var maps = new HashMap<Integer, String>();
        maps.put(1, "aaa");
        maps.put(2, "bbb");
        maps.put(3, "ccc");
        // loop by entry set
        for (var map: maps.entrySet()) {
            System.out.println("key=" + map.getKey() + " val=" + map.getValue());
        }
        // loop by key set
        for (var key: maps.keySet()) {
            System.out.println("key=" + key + " val=" + maps.get(key));
        }
        // loop by values
        for (var val:maps.values()) {
            System.out.println(val);
        }
    }

    // how to loop a sorted map in java. SortedMap is interface while TreeMap is concrete class
    public void LoopTreeMap() {
        var amaps = new TreeMap<Integer, String>();     // asc
        amaps.put(3, "ccc");
        amaps.put(2, "bbb");
        amaps.put(1, "aaa");
        var dmaps = amaps.descendingMap();              // desc
        // loop by entry set
        for (var map: amaps.entrySet()) {
            System.out.println("key=" + map.getKey() + " val=" + map.getValue());
        }
        // loop by key set
        for (var key: amaps.keySet()) {
            System.out.println("key=" + key + " val=" + amaps.get(key));
        }
    }

    // how to loop a stack in java
    public void LoopStack() {
        var stacks = new LinkedList<>();
        stacks.push("aaa"); System.out.println(stacks);
        stacks.push("bbb"); System.out.println(stacks);
        stacks.push("ccc"); System.out.println(stacks);
        for (var stack: stacks) {
            System.out.println(stack);
        }
        stacks.pop(); System.out.println(stacks);
        stacks.pop(); System.out.println(stacks);
        stacks.pop(); System.out.println(stacks);
    }

    // how to loop queue in java
    public void LoopQueue() {
        var queues = new PriorityQueue<String>();
        queues.add("aaa"); System.out.println(queues);
        queues.add("bbb"); System.out.println(queues);
        queues.add("ccc"); System.out.println(queues);
        for (var queue: queues) {
            System.out.println(queue);
        }
        queues.poll(); System.out.println(queues);
        queues.poll(); System.out.println(queues);
        queues.poll(); System.out.println(queues);
    }

    // how to loop linked list in java
    public void LoopLinkedList() {
        var llist = new LinkedList<String>();
        llist.add("bbb"); System.out.println(llist);
        llist.addFirst("aaa"); System.out.println(llist);
        llist.addLast("ccc"); System.out.println(llist);
        for(var litm: llist){
            System.out.println(litm);
        }
        llist.removeFirst(); System.out.println(llist);
        llist.removeLast(); System.out.println(llist);
    }

}
