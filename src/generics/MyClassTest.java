package generics;

public class MyClassTest {
    public static void main(String[] args) {

        Integer[] ints = {3, 6, 2, 8, 6};
        Character[] chars = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(ints);
        MyClass<Character> chs = new MyClass<>(chars);

        System.out.println("ints max = " + iob.max());
        System.out.println("ints min = " + iob.min());
        System.out.println("chars chs = " + chs.min());
        System.out.println("chars chs = " + chs.max());
    }
}
