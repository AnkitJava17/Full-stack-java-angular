package ThreadsDemo;

public class JTDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnig in interface Runnable");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
    }
    
}
