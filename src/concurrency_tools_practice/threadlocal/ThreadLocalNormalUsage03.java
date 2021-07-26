package concurrency_tools_practice.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author CoderZk
 */
public class ThreadLocalNormalUsage03 {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            threadPool.submit((new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalNormalUsage03().date(finalI);
                    System.out.println(date);
                }
            }));
        }
        threadPool.shutdown();
    }

    public String date(int seconds) {
        // 参数的单位是毫秒, 从1970.1.1 00:00:00 GMT 计时
        Date date = new Date(1000 * seconds);
        return simpleDateFormat.format(date);
    }

}
