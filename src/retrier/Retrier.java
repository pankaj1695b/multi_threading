package retrier;

public class Retrier {

    public static <R, T> R retry(T request, RequestHandler<R, T> requestHandler) throws InterruptedException {
        R response = null;
        while(response == null) {
            try {
                response = requestHandler.submit(request);
            } catch (Exception e) {
                System.out.println("Request failed");
                e.printStackTrace();
                System.out.println("Retrying...");
                Thread.sleep(1000);
            }
        }
        return response;
    }
}
