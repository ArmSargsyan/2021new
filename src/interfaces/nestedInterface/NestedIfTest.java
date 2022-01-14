package interfaces.nestedInterface;

public class NestedIfTest {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("chislo polojitelnoe");
        if (nif.isNotNegative(-12))
            System.out.println("xxxxxxxxxx");
    }
}
