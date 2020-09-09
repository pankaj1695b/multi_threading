package notifier.services;

import notifier.observers.Observer;

public interface Service<T> {

    public void register(Observer<T> observer);

    public void notifyObservers(T t);

}
