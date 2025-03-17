import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Vehicle {
    protected String name;
    protected int acceleration;
    protected int speed=0;

    public boolean haveEngine = true;
    public boolean started = false;

    void increaseVelocity() {
        if(!this.haveEngine || (this.haveEngine && this.started)){
            this.speed += this.acceleration;
        }else{
            System.out.println("The vehicle " + this.name + " is not started.");
        }
    }

    void decreaseVelocity() {
        if(!this.haveEngine || (this.haveEngine && this.started)){
            this.speed -= this.acceleration;
        }else{
            System.out.println("The vehicle is not started.");
        }
    }

    public int getSpeed() {
        return this.speed;
    }

}
