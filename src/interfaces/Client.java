package interfaces;

public class Client implements CallBack{
    @Override
    public void callback(int param) {
        System.out.println("Method callback " + " znachenie "+ param);
    }
    void nonIfaceMeth(){
        System.out.println("B классах, реализующих интерфейсы,"
                + "могут определяться и другие члены.");
    }
}
