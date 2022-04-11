package lambdas.countHighTemp;

public class HighTemp {
    private int hTemp;

    HighTemp (int ht){
        hTemp = ht;
    }

    boolean sneTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
