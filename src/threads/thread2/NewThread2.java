package threads.thread2;

public class NewThread2 extends Thread{

    NewThread2(){
        super("Demo thread ");
        System.out.println("dother thread "+this);
        start();
    }
    public void run(){
        try {
        for (int i = 5; i >0 ; i--)
            System.out.println("dother thred "+i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
            System.out.println("douther thread stopped ");
            }
        System.out.println("dother thread finished ");

    }
}
