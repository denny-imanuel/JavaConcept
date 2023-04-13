import java.util.*;

// This class shows how to use synchronized collection. Synchronized collection use blocking method via locking mechanism,
// by locking a collection from incoming thread until the current thread finish executing
public class SyncCollect {

    public void SyncList() throws InterruptedException {
        var syncList = Collections.synchronizedList(new ArrayList<>());
        Runnable task = () -> {
            syncList.addAll(Arrays.asList(1,2,3,4,5)); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncList);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


    public void SyncHashSet() throws InterruptedException {
        var syncSet = Collections.synchronizedSet(new HashSet<Integer>());
        Runnable task = () -> {
            syncSet.addAll(Arrays.asList(1,1,2,2,3,3)); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncSet);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void SyncTreeSet() throws InterruptedException {
        var syncSet = Collections.synchronizedSortedSet(new TreeSet<>());
        Runnable task = () -> {
            syncSet.addAll(Arrays.asList(5,4,3,2,1)); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncSet);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncSet);
    }

    public void SyncHashMap() throws InterruptedException {
        var syncMap = Collections.synchronizedMap(new HashMap<Integer, String>());
        Runnable task = () -> {
            syncMap.put(1, "aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
            syncMap.put(2, "bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
            syncMap.put(3, "ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void SyncTreeMap() throws InterruptedException {
        var syncMap = Collections.synchronizedSortedMap(new TreeMap<Integer, String>());
        Runnable task = () -> {
            syncMap.put(3, "ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
            syncMap.put(2, "bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
            syncMap.put(1, "aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void SyncCollection() {
        var syncStack = Collections.synchronizedCollection(new LinkedList<>());
        var syncQueue  = Collections.synchronizedCollection(new PriorityQueue<>());
        Runnable task = ()-> {
            syncStack.add("aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncStack);
            syncStack.add("bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncStack);
            syncStack.add("ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncStack);
            syncQueue.add("aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncQueue);
            syncQueue.add("bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncQueue);
            syncQueue.add("ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + syncQueue);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }
}
