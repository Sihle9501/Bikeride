package bicycles;

public class BikeRide {

    private int Speed;
    private Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
    }

    private int currentSpeed() {
        return Speed;
    }
}
