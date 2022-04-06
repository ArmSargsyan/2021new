package override.interface1;

public class AnotherClient implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Another option method Callback ");
        System.out.println("p in square = " + (p*p));
    }
}
