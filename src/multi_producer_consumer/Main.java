package multi_producer_consumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource(7);
        Producer producer1 = new Producer(resource, 0,10);
        Producer producer2 = new Producer(resource, 11,20);
        Consumer consumer1 = new Consumer(resource);
        Consumer consumer2 = new Consumer(resource);
        Thread p1 = new Thread(producer1);
        p1.setName("producer1");
        Thread p2 = new Thread(producer2);
        p2.setName("producer2");
        Thread c1 = new Thread(consumer1);
        c1.setName("consumer1");
        Thread c2 = new Thread(consumer2);
        c2.setName("consumer2");
        p1.start();
        p2.start();
        Thread.sleep(2000);
        c1.start();
        c2.start();
    }
}
