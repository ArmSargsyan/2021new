package threads.waitAndNotify;

public class Consumer implements Runnable{

    Q q;
    Consumer(Q q){
        this.q = q;
        new Thread(this,"potrebitel").start();
    }
    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
