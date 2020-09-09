package notifier.observers;

public class Observer1 implements Observer<Integer> {
    @Override
    public void update(Integer integer) {
        System.out.println("Observer1 updated with value: " + integer);
    }
}
