package ThreadsDemo;

public class JTDemo1 extends Thread {

    @Override
    public void run() {
        System.out.println("Running in Thread class");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
    }
}
