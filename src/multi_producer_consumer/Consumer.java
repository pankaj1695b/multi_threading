package multi_producer_consumer;

public class Consumer implements Runnable{
    private Resource resource;
    private boolean alive = true;

    Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (this.alive) {
            try {
                resource.remove();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void kill () {
        this.alive = false;
    }
}
