package exept;

public class MultiCatches {
    public static void main(String[] args) {

        try {
           // int a = args.length;
            int a = 11;
            System.out.println("a= "+a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("delenie na 0 "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("После блока операторов try/catch.");
    }
}
