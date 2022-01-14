package interfaces;

public class Testiface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        Client2 c2 = new Client2();

        c.callback(42);
        c = c2;
        c.callback(42);

    }

}
