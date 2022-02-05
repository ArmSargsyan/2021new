package threads.bestThread;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("priostanovka thread One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("vozobnovlenie thread One");
            ob2.mySuspend();
            System.out.println("priostanovka thread Tvo");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("vozobnovlenie thred Two");
        } catch (InterruptedException e) {
            System.out.println(" main thread boooomm");
        }

        try {
            System.out.println("ojidanie zaversheniya potokov");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread boom");
        }
        System.out.println("main thread compleated");
    }
}
