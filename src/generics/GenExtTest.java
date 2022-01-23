package generics;

public class GenExtTest {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        GenExtend<Integer> iob = new GenExtend<>(inums);

        double x = iob.aver();
        System.out.println("iob= " + x);

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenExtend<Double> dob = new GenExtend<>(doubles);

        double w = dob.aver();
        System.out.println("dob = " + w);

        Float[] floats = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        GenExtend<Float> fob = new GenExtend<>(floats);
        double y = fob.aver();
        System.out.println("fob= " + y);

        if (iob.someAver(dob)) {
            System.out.println("ok smooth");

        } else {
            System.out.println("no smooth");
        }

        if (iob.someAver(fob)) {
            System.out.println("ok smooth");

        } else {
            System.out.println("no smooth");
        }
    }
}
