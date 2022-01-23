package exept;

public class MyExceptionTest {
    static void compute(int a) throws Exception{
        System.out.println("compute"+ a);
        if (a>10)
            throw new MyException(a);
        System.out.println("norm end");
    }

    public static void main(String[] args) throws Exception {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("perexvat "+e);
        }
    }
}
