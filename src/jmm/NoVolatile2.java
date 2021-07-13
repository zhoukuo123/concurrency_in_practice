package jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * volatile适用的情况1
 * @author CoderZk
 */
public class NoVolatile2 implements Runnable {

    public volatile boolean done = false;
    AtomicInteger readA = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new NoVolatile();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
//        System.out.println(((NoVolatile) runnable).done);
        System.out.println(((NoVolatile) runnable).readA.get());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            flipDone();
            readA.incrementAndGet();
        }
    }

    private void flipDone() {
        done = !done;
    }
}
