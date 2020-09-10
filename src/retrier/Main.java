package retrier;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Request req = new Request();
        boolean r = Retrier.retry(0.3, req::makeRequest);
    }
}
