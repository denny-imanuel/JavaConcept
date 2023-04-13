import java.util.Arrays;
import java.util.concurrent.*;

// This class shows how to use concurrent collection. Concurrent collection use non-blocking method
// via segmentation method to redirect threads to different part of collection simultaneously.
public class ConCollect {

    // how to use copy and write array list
    public void CoppyOnWriteArrayList() throws InterruptedException {
        var cowaList = new CopyOnWriteArrayList<Integer>();
        Runnable task = ()->{
            cowaList.addAll(Arrays.asList(1,2,3,4,5));
            System.out.println("Thread " + Thread.currentThread().getId() + "-" + cowaList);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


    // how to use concurrent skip list set
    public void ConSkipListSet() throws InterruptedException{
        var cslSet = new ConcurrentSkipListSet<Integer>();
        Runnable task = ()->{
            cslSet.addAll(Arrays.asList(3,3,2,2,1,1));
            System.out.println("Thread " + Thread.currentThread().getId() + "-" + cslSet);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent skip list map
    public void ConSkipListMap() throws InterruptedException{
        var cslMap = new ConcurrentSkipListMap<Integer, String>();
        Runnable task = ()->{
            cslMap.put(3,"ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + cslMap);
            cslMap.put(2,"bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + cslMap);
            cslMap.put(1,"aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + cslMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent hash map
    public void ConHashMap() throws InterruptedException {
        var chMap = new ConcurrentHashMap<Integer, String>();
        Runnable task = ()->{
            chMap.put(3, "ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + chMap);
            chMap.put(2, "bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + chMap);
            chMap.put(1, "aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + chMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent linked queue
    public void ConLinkedQueue() throws InterruptedException {
        var clQueue = new ConcurrentLinkedQueue<Integer>();
        Runnable task = ()-> {
            clQueue.add(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
            clQueue.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
            clQueue.add(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
            clQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
            clQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
            clQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clQueue);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    // how to use concurrent linked dequeue. Dequeue is double ended queue.
    public void ConLinkedDeque() throws InterruptedException {
        var clDeque = new ConcurrentLinkedDeque<Integer>();
        Runnable task = ()-> {
            clDeque.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
            clDeque.addFirst(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
            clDeque.addLast(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
            clDeque.pollLast(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
            clDeque.pollFirst(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
            clDeque.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + clDeque);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


}
