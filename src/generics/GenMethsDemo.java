package generics;

public class GenMethsDemo {

    static <T extends Comparable<T>, V extends T>

    boolean isin(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i]))
                return true;
        return false;
    }

    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};

        if (isin(2,nums))
            System.out.println(" 2 ok");

        if (isin(2,nums))
            System.out.println("7 does not");

        String[] str = {"one", "two", "three", "four", "five"};
        if (isin("two", str))
            System.out.println("two  is ok");
    }

}
