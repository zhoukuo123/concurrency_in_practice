package threadcoreknowledge.startthread;

/**
 * 对比start和run两种启动线程的方式
 *
 * @author CoderZk
 * @date 2020/10/27
 */
public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        runnable.run(); // 错误方法, 实际并没有启动新线程

        new Thread(runnable).start();
    }
}
