package lock.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author CoderZk
 */
public class MustUnlock {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        try {
            // 获取本锁保护的资源
            System.out.println("123");
        } finally {
            lock.unlock();
        }
    }
}
