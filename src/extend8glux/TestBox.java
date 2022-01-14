package extend8glux;

public class TestBox {

    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 15, 22, 17);
        BoxWeight myBox2 = new BoxWeight(2,3,4,10.054);
        double vol;

        vol = myBox1.volume();
        System.out.println(vol);

        System.out.println(myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println(vol  );
        System.out.println(myBox2.weight);
    }


}
