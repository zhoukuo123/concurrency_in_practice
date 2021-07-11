package threadcoreknowledge.startthread;

/**
 * @author CoderZk
 * @date 2020/10/27
 */
public class CantStartTwice {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start(); // 会抛异常
    }
}


