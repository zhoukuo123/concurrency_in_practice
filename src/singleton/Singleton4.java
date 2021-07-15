package singleton;

/**
 * 懒汉式(线程安全) (不推荐)
 * @author CoderZk
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    /**
     * 效率低下
     * @return
     */
    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
