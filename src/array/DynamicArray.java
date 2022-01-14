package array;

public class DynamicArray {

    int[] array = new int[10];
    int size;

    DynamicArray() {
    }

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    int getByIndex(int index) {
        return array[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int max() {         // gtnel maximum element
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int deleteByIndex(int index) {          //jnjel tvac indexov element
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        return size--;
    }

    public void deleteByValue(int value) {   //jnjel tvac arjeqov element
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                deleteByIndex(i);
            //    break;                     // break avelacnelov kjnje krknvox elementneric menak arajin
            }
        }
    }

    public int[] subArray(int startIndex, int endIndex){     // massib kktre kstana aveli poqr masiv
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
                tmp[index++] = array[i];
        }
        return tmp;
    }

}
