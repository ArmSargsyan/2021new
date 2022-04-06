package patterns.builerPattern.builders;

public class Manual {

    private CarType carType;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public Manual(CarType type, int seats, Engine engine, TripComputer tripComputer, Transmission transmission, GPSNavigator gpsNavigator) {
        this.carType = type;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine volume : " + engine.getVolume() + "\n";
        info += "Transmission : " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip computer functional: " + "\n";
        } else {
            info += "Trip computer N/A " + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }

        return info;
    }
}
