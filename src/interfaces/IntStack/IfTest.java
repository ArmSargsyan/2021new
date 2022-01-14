package interfaces.IntStack;

public class IfTest {
    public static void main(String[] args) {

        FixedStack fx1 = new FixedStack(5);
        FixedStack fx2 = new FixedStack(8);

        for (int i = 0; i < 12; i++)
            fx1.push(i);
        for (int i = 0; i < 20; i++)
            fx2.push(i);

        System.out.println("stack in fx1");
        for (int i = 0; i < 12; i++)
            System.out.println(fx1.pop());

        System.out.println("stack in fx2");
        for (int i = 0; i < 20; i++)
            System.out.println(fx2.pop());

    }
}
