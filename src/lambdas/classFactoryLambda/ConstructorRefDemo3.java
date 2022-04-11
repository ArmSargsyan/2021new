package lambdas.classFactoryLambda;

public class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        MyFunc<MyClass<Double>, Double> myClassCons = MyClass::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("meaning val in object " + mc.getVal());

        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("meaning str in object " + mc2.getStr());
    }
}
