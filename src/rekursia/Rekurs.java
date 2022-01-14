package rekursia;

public class Rekurs {

    long fact(int n){
        long result;
        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
