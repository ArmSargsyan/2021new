package threads.thread1;

public class NewThreadTest {
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("main thread stopped");
        }
        System.out.println("main thread completed");
    }
}
