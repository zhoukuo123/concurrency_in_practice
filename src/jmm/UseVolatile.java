package jmm;

import singleton.Singleton8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * volatile适用的情况1
 * @author CoderZk
 */
public class UseVolatile implements Runnable {

    public volatile boolean done = false;
    AtomicInteger readA = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Singleton8.INSTANCE.whatever();
        NoVolatile runnable = new NoVolatile();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
//        System.out.println(runnable.done);
        System.out.println(runnable.readA.get());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            setDone();
            readA.incrementAndGet();
        }
    }

    private void setDone() {
        done = true;
    }
}
