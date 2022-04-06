package patterns.builerPattern.builders;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructorSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built: "+car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructorSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("Car Manual Build: "+ carManual.print());
    }
}
