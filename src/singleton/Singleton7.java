package singleton;

/**
 * 静态内部类方式, 可用
 * 是线程安全的, 同时是懒加载
 * @author CoderZk
 */
public class Singleton7 {

    private Singleton7() {

    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}