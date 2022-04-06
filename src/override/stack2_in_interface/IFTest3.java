package override.stack2_in_interface;

import interfaces.IntStack.FixedStack;
import interfaces.IntStack.IntStack;

public class IFTest3 {
    public static void main(String[] args) {

        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
//
//        myStack = ds;
//        for (int i = 0; i < 12; i++)
//            myStack.push(i);

        myStack = fs;
        for (int i = 0; i < 8; i++)
            myStack.push(i);

//        myStack = ds;
//        System.out.println("values in Dynamic Stack ");
//        for (int i = 0; i < 12; i++) {
//            myStack.pop();
//        }

        myStack = fs;
        System.out.println("values in Fixed Stack ");
        for (int i = 0; i < 8; i++) {
            myStack.pop();
        }

    }
}
