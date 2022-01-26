package threads.sinchronThread;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Welcome to");
        Caller ob2 = new Caller(target, "sinchronyzed");
        Caller ob3 = new Caller(target, "world");

        try {
            ob1.t.join();
            ob2.t.join(10000);
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }

    }
}
