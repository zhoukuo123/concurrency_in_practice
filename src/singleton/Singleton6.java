package singleton;

/**
 * 双重检查 (推荐面试使用)
 * @author CoderZk
 */
public class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6() {

    }

    public static Singleton6 getInstance() {
        // 这里增加一层if判断, 是为了性能问题, 而不是一上来就去抢锁
        if (instance == null) {
            synchronized (Singleton6.class) {
                // 双重检查的位置 double-check 是因为在这里添加了一层if判断
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}