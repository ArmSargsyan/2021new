package threads.waitAndNotify;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException");
            }

        System.out.println("polucheno " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException");
            }

        this.n = n;
        valueSet = true;
        System.out.println("otpravleno " + n);
        notify();
    }
}
