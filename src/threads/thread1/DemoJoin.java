package threads.thread1;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("thread one started " + ob1.t.isAlive());
        System.out.println("thread two started " + ob2.t.isAlive());
        System.out.println("thread three started " + ob3.t.isAlive());

        try {
            System.out.println("whathing finished threads ");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("main thread is compleated");
        }
        System.out.println("thread one started "+ ob1.t.isAlive());
        System.out.println("thread two started "+ ob2.t.isAlive());
        System.out.println("thread three started "+ ob3.t.isAlive());
        System.out.println("main thread compleated");
    }
}
