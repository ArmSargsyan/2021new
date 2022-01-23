package generics;

public class GenExtend<T extends Number> {

    T[] nums;

    GenExtend(T[] o) {
        nums = o;
    }

    double aver() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    boolean someAver(GenExtend<?> ob){
        if (aver()==ob.aver())
            return true;
        return false;
    }

}
