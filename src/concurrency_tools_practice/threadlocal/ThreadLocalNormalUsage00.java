package concurrency_tools_practice.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author CoderZk
 */
public class ThreadLocalNormalUsage00 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalNormalUsage00().date(10);
                System.out.println(date);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalNormalUsage00().date(1007);
                System.out.println(date);
            }
        });
        thread2.start();
    }

    public String date(int seconds) {
        // 参数的单位是毫秒, 从1970.1.1 00:00:00 GMT 计时

        Date date = new Date(1000 * seconds);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(date);

    }

}
