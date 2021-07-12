package threadcoreknowledge.stopthreads;

/**
 * 错误的停止方法: 用stop()来停止线程, 会导致线程运行一半突然停止, 没办法完成一个基本单位的操作, 会造成脏数据
 * @author CoderZk
 */
public class StopThread implements Runnable {

    @Override
    public void run() {

    }
}
