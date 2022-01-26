package threads.waitAndNotify;

public class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "postavchik").start();
    }
    @Override
    public void run() {
        int i = 1;
        while (true){
            q.put(i++);
        }
    }
}
