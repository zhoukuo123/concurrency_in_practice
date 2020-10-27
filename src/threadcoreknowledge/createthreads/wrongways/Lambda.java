package threadcoreknowledge.createthreads.wrongways;

/**
 * @author CoderZk
 * @date 2020/10/27
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
