package array;

public class ArraySort {
    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();

        arr.add(11);
        arr.add(22);
        arr.add(21);
        arr.add(43);
        arr.add(8);
        arr.add(16);
        arr.add(77);
        arr.add(54);

       // arr.print();
        System.out.println(arr.max());
    }
}
