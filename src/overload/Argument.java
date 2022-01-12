package overload;

public class Argument {

    int a, b;

    Argument(int i, int j) {
        a = i;
        b = j;
    }
    void method(Argument o){
        o.a *=2;
        o.b /=2;
    }
}
