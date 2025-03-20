public class Car extends Vehicle {

    public Car() {
        this.name="Car";
        this.acceleration = 10;
    }

    @Override
    public String toString(){
        return "Car engine started: " + this.started + ", speed: " + this.speed +" Km/h";
    }
}
