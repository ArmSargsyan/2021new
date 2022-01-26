package threads.thread2;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("main thread "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread stopped");
        }
        System.out.println("main thread finished");
    }
}
