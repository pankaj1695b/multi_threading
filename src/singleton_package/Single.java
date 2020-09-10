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
        if (innerSingle.s != null) {
            throw new RuntimeException("Class already initialized", new RuntimeException());
        }
    }
    private static class innerSingle {
        private static Single1 s = new Single1();
    }

    public static Single1 get() {
        return innerSingle.s;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}


