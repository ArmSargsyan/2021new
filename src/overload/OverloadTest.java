package overload;

public class OverloadTest {

    public static void main(String[] args) {
        Overload ol = new Overload();
        double result;

        ol.test();
        ol.test(10);
        ol.test(10,20);
        result = ol.test(123.25);
        System.out.println(result);
    }
}
