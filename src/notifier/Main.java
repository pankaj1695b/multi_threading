package notifier;

import notifier.observers.Observer;
import notifier.observers.Observer1;
import notifier.observers.Observer2;
import notifier.services.Service;
import notifier.services.Service1;

public class Main {
    public static void main(String[] args) {
        Service<Integer> s = new Service1();
        Observer<Integer> o1 = new Observer1();
        Observer<Integer> o2 = new Observer2();
        s.register(o1);
        s.register(o2);
        s.notifyObservers(2);
        s.notifyObservers(3);
    }
}
