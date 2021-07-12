package threadcoreknowledge.stopthreads;

/**
 * 最佳实践: catch了InterruptException之后的优先选择: 在方法签名中抛出异常
 * 那么在run()方法就会强制try/catch
 * @author CoderZk
 */
public class RightWayStopThreadInProd implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                throwInMethod();
            } catch (InterruptedException e) {
                // 保存日志, 停止程序等去正确地响应中断
                e.printStackTrace();
            }
        }
    }

    private void throwInMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadInProd());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
