package bicycles;

public class MountainBike extends BicycleBase {
/*
    private int speed;
*/

    public void accelerate(){
        changeSpeed(5);
    }

    public void brake(){
       changeSpeed(-3);
    }

/*
    public int currentSpeed();{
        return speed;
    }

    public void stop();{
        speed = 0;
    }*/
}