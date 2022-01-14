package interfaces;

public class Client2 implements CallBack{
    @Override
    public void callback(int param) {
        System.out.println("Method callback2 " + " znachenie "+ (param * param));
    }
    void nonIfaceMeth(){
        System.out.println("B классах, реализующих интерфейсы,"
                + "могут определяться и другие члены.");
    }
}
