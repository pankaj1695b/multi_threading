package retrier;

public class Request {
    public boolean makeRequest(double p) {
        System.out.println("making request");
        if (p>1){
            return true;
        }
        double result = Math.random();
        System.out.println("result: " + result);
        if (result < p) {
            System.out.println("Request Succeeded !!");
            return true;
        }

        throw new RuntimeException("Request Failed !! ", new Exception());
    }

}
