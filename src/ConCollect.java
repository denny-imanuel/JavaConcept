import java.util.Arrays;
import java.util.concurrent.*;

// This class shows how to use concurrent collection. Concurrent collection use non-blocking method
// via segmentation method to redirect threads to different part of collection simultaneously.
public class ConCollect {

    // how to use copy and write array list
    public void CoppyOnWriteArrayList() throws InterruptedException {
        var cowAl = new CopyOnWriteArrayList<Integer>();
        Runnable task = ()->{
            cowAl.addAll(Arrays.asList(1,2,3,4,5));
            System.out.println("Thread " + Thread.currentThread().getId() + "-" + cowAl);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


    // how to use concurrent skip list set
    public void ConSkipListSet() throws InterruptedException{
        var conSet = new ConcurrentSkipListSet<Integer>();
        Runnable task = ()->{
            conSet.addAll(Arrays.asList(3,3,2,2,1,1));
            System.out.println("Thread " + Thread.currentThread().getId() + "-" + conSet);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent skip list map
    public void ConSkipListMap() throws InterruptedException{
        var conMap = new ConcurrentSkipListMap<Integer, String>();
        Runnable task = ()->{
            conMap.put(3,"ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(2,"bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(1,"aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent hash map
    public void ConHashMap() throws InterruptedException {
        var conMap = new ConcurrentHashMap<Integer, String>();
        Runnable task = ()->{
            conMap.put(3, "ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(2, "bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(1, "aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent linked queue
    public void ConLinkedQueue() throws InterruptedException {
        var conQueue = new ConcurrentLinkedQueue<Integer>();
        Runnable task = ()-> {
            conQueue.add(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.add(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent linked dequeue. Dequeue is double ended queue.
    public void ConLinkedDeque() throws InterruptedException {
        var conDeque = new ConcurrentLinkedDeque<Integer>();
        Runnable task = ()-> {
            conDeque.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.addFirst(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.addLast(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.pollLast(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.pollFirst(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


}
