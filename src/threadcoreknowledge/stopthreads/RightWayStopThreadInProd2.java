package threadcoreknowledge.stopthreads;

/**
 * 最佳实践: 在catch语句中调用Thead.currentThread().interrupt()来恢复设置中断状态
 * 以便在后续的这执行中, 依然能够检查到刚才发生了中断
 * @author CoderZk
 */
public class RightWayStopThreadInProd2 implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            reInterrupt();
        }
    }

    private void reInterrupt() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadInProd2());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
