package lambdas.classFactoryLambda;

public class MyClass <T>{
    private T val;

    public MyClass(T v) {
        this.val = v;
    }

    public MyClass(){
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}
