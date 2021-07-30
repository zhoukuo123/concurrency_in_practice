package lock.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author CoderZk
 */
public class PessimismOptimismLock {

    int a;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }

    public synchronized void testMethod() {
        a++;
    }


}
