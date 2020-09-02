package multi_producer_consumer;

import java.util.LinkedList;

public class Resource {
    private LinkedList<Integer> sharedQueue;
    private int capacity;

    Resource(int capacity) {
        this.sharedQueue = new LinkedList<>();
        this.capacity = capacity;
    }

    public void add (int v) {
        try {
            synchronized (this) {
                if (this.sharedQueue.size() < capacity) {
                    this.sharedQueue.add(v);
                    System.out.println("Produced resource by " + Thread.currentThread().getName() + " : " + v);
                    notify();
                } else {
                    wait();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove () throws InterruptedException {
        synchronized (this) {
            if(this.sharedQueue.isEmpty()){
                wait();
            } else {
                int c = this.sharedQueue.removeFirst();
                System.out.println("Consumed resource by " + Thread.currentThread().getName() + " : " + c);
                notify();
            }
        }
    }
}
