package ThreadsDemo;

public class JTDemo3 extends Thread {

    int num;

    public JTDemo3(int num1) {
        this.num = num1;
    }

    @Override
    public void run() {
        int ctr = 0;
        int checkNum = 0;
        do{
            checkNum = (int) (Math.random() * 100 + 1);
            System.out.println("Check number " + checkNum);
            ctr++;
        }while (checkNum != num);
    }

}
