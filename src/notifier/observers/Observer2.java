package notifier.observers;

public class Observer2 implements Observer<Integer> {
    @Override
    public void update(Integer integer) {
        System.out.println("Observer2 updated with value: " + integer);
    }
}
