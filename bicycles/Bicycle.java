package bicycles;

public interface Bicycle {
    /*private int speed;*/
    public void accelerate(); /*{
        speed = speed + 5;
    }*/
    public void brake(); /*
       speed = speed - 3;*/

    public int currentSpeed(); /*{
        return speed;
    }*/

    public void stop() ;/*{
        speed = 0;
    }*/
}
