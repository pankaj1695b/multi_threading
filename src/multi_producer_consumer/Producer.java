package multi_producer_consumer;

public class Producer implements Runnable {

    private Resource resource;
    private int start;
    private int end;

    Producer(Resource resource, int start, int end) {
        this.resource = resource;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i=start; i<= end; i++){
            try {
                resource.add(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
