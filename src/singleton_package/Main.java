package singleton_package;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, NoSuchMethodException {
        Runnable runnable = () -> System.out.println(Single1.get());
        Thread a = new Thread(runnable);
        Thread b = new Thread(runnable);
        a.start();
        b.start();
        a.join();
        b.join();
        Constructor constructor = Single1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            System.out.println(constructor.newInstance());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Pattern is not broken with reflection");
            e.printStackTrace();
        }
    }
}
