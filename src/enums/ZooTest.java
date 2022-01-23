package enums;

public class ZooTest {
    public static void main(String[] args) {

        Zoo zooLand;
        System.out.println("all animals : ");

        Zoo[] allAnimals = Zoo.values();
        for (Zoo z : allAnimals)
        System.out.println(z);
        System.out.println();
        for (Zoo zz: Zoo.values())
        System.out.println(zz+" count "+zz.getCount()+" "+zz.getClazz());

        zooLand=Zoo.valueOf("DOG");
        System.out.println(zooLand);


    }
}
