package overload;

public class ArgumentPass {
    public static void main(String[] args) {

        Argument ar = new Argument(15, 20);
        System.out.println(ar.a+ " "+ ar.b);

        ar.method(ar);

        System.out.println(ar.a+ " "+ ar.b);

    }
}
