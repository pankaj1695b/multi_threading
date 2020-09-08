package singleton_package;

import java.io.Serializable;

public class Single implements Cloneable, Serializable {

    private static Single s;

    private Single () {

    }

    public static Single get() throws InterruptedException {
        synchronized (Single.class) {
            if (s == null) {
                Thread.sleep(2000);
                s = new Single();
            }
        }
        return s;
    }

    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}

class Single1 implements Cloneable{

    private Single1() {

    }
    private static class innerSingle {
        private static Single1 s = new Single1();
    }

    public static Single1 get() throws InterruptedException {
        return innerSingle.s;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Single1.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Single1.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        a.start();
        b.start();

        a.join();
        b.join();

        Single1 c = Single1.get();
        Single1 d = (Single1) c.clone();
        System.out.println(c);
        System.out.println(d);
    }
}
