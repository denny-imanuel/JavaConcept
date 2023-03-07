import java.util.*;

public class Collection {

    public void LoopString() {
        var str = "abcde";
        var chars = str.toCharArray();
        for (var chr:chars) {
            System.out.println(chr);
        }
    }

    public void LoopArray() {
        var arr = new int[] {1,2,3,4,5};
        for (var itm: arr) {
            System.out.println(itm);
        }
    }

    public void LoopList() {
        var list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        for (var itm: list) {
            System.out.println(itm);
        }
    }

    public void LoopHashSet() {
        var set = new HashSet<Integer>(Arrays.asList(1,1,2,2,3,3));
        for (var itm: set) {
            System.out.println(itm);
        }
    }

    public void LoopTreeSet() {
        var set = new TreeSet<Integer>(Arrays.asList(5,4,3,2,1));
        for (var itm: set) {
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
    
    public void LoopTreeMap() {
        var maps = new TreeMap<Integer, String>();
        maps.put(3, "ccc");
        maps.put(2, "bbb");
        maps.put(1, "aaa");
        // loop by entry set
        for (var map: maps.entrySet()) {
            System.out.println("key=" + map.getKey() + " val=" + map.getValue());
        }
        // loop by key set
        for (var key: maps.keySet()) {
            System.out.println("key=" + key + " val=" + maps.get(key));
        }
    }

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
