package threadcoreknowledge.createthreads;

public class ThreadStyle extends Thread {

    public static void main(String[] args) {
        new ThreadStyle().start();
    }

    @Override
    public void run() {
        System.out.println("用Thread类实现线程");
    }

}
