package ThreadsDemo;

public class JTDemo4 extends Thread{

    private String data;

    public JTDemo4(String data){
        this.data = data;
    }
    @Override
    public void run(){

        while (JTMain4.start){
            System.out.println("Display Message");

            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println(e);
            }finally{
                System.out.println("Exit");
            }
        }
    }
}
