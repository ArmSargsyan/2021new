package array;

public class BubbleSort {
    public static void main(String[] args) {


        //   https://www.facebook.com/mrkaren/videos/3959303404136080
        //48:00 min
        int[] arr = {22, 32, 42, 12, 11, 43, 54, 37, 33};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
