package ThreadsDemo;

public class JTMain {
    public static void main(String[] args) {

        Thread tobj = new JTDemo3(3);
        tobj.start();

        tobj.setPriority(Thread.MAX_PRIORITY);
        // JTDemo1 jobj1 = new JTDemo1();
        // jobj1.start();


        // JTDemo2 jobj2 = new JTDemo2();
        // Thread tobj = new Thread(jobj2);

        // tobj.start();
    }
}
