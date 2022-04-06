package override.nestedInterface;

public class NestedDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("number is nor negative");
        if (nif.isNotNegative(-12))
            System.out.println("then is wont be printed");

    }
}
