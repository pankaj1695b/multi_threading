package book_my_show.services;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Scheduler {
    private static ExecutorService scheduler = Executors.newFixedThreadPool(3);

    public static <T> Future<T> submitTask(Callable<T> task){
        return scheduler.submit(task);
    }
}
