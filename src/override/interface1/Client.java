package override.interface1;

public class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Callback meaning " + p);
    }

    void nonifaceMeth(){
        System.out.println("outher classies and interfaces ");
    }
}
