package override.stack2_in_interface;

public class IFTest2 {
    public static void main(String[] args) {

        DynStack ds1 = new DynStack(5);
        DynStack ds2 = new DynStack(8);

        for (int i = 0; i < 12; i++)
            ds1.push(i);
         for (int i = 0; i < 20; i++)
            ds2.push(i);

        System.out.println("Stack in ds1: ");
        for (int i = 0; i < 12; i++)
            ds1.pop();
        System.out.println("Stack in ds2: ");
        for (int i = 0; i < 20; i++)
            ds2.pop();

    }
}
