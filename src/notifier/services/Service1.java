package notifier.services;

import notifier.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Service1 implements Service<Integer> {
    List<Observer<Integer>> observers;

    public Service1(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Integer a) {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(a);
        }
    }
}
