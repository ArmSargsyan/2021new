package lambdas.classFactoryLambda;

public class MyClass2 {
    String str;

    public MyClass2(String s) {
        this.str = s;
    }

    public MyClass2(){
        str = "";
    }

    public String getStr() {
        return str;
    }
}
