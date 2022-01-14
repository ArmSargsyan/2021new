package array;

public class TwoDArray {

    public static void main(String[] args) {
        //https://www.facebook.com/mrkaren/videos/3945877525478668
//
//        int[][] twoD = new int[4][5];
//        int i, j, k = 0;
//
//        for (i = 0; i < twoD.length; i++)
//            for (j = 0; j < twoD[i].length; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < 5; j++)
//                System.out.print(twoD[i][j] + " ");
//            System.out.println();
//        }
//
//        int[] array = {22, 32, 42, 12, 11, 43, 54, 37, 33};
//        int max = array[0];
//
//        for (int y = 0; y < array.length; y++) {
//            if (array[y] > max) {
//                max = array[y];
//            }
//
//        }
//        System.out.println(max);
//
//
//        String binary[] = {"0000", "0001", "0010", "0011", "0100",
//                "0101", "1011", "0110", "0111", "1000", "1001", "1010",
//                "1100", "1101", "1110", "1111"};
//        int a = 3;
//        int b = 6;
//        int c = a | b;
//        int d = a & b;
//        int e = a ^ b;
//        int f = (~a & b) | (a & ~b);
//        int g = ~a & 0x0f;
//
//        System.out.println( binary[a]);
//        System.out.println( binary[b]);
//        System.out.println( binary[c]);
//        System.out.println( binary[d]);
//        System.out.println( binary[e]);
//        System.out.println( binary[f]);
//        System.out.println( binary[g]);

        int[] arr = {22, 32, 42, 12, 11, 43, 54, 37, 33};
        int odd = 0;
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] % 2 == 1) {
                odd++;
            }
        }
        System.out.println(odd); //zuygeri qanak
    }
}
