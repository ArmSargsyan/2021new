package enums;

public enum Zoo {

    FISH(22, "A"), BEAR(3,"B"), MONKEY(8,"C"), CAT(5,"D"), DOG(7,"E"), PELICAN(28,"F");

    private int count;
    private String clazz;

    Zoo(int z,String c) {
        count = z;
        clazz = c;
    }
    int getCount(){
        return count;
    }
    String getClazz(){
        return clazz;
    }

}
