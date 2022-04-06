package override.stack_in_interface;

public class IFTest {
    public static void main(String[] args) {

        FixedStack fx1 = new FixedStack(5);
        FixedStack fx2 = new FixedStack(8);

        for (int i = 0; i < 5; i++)
            fx1.push(i);
        for (int i = 0; i < 8; i++)
            fx2.push(i);

        System.out.println("Stack in fx1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(fx1.pop());
        }
         System.out.println("Stack in fx2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(fx2.pop());
        }
    }
}
