public class Boat extends Vehicle {

    public Boat() {
        this.name="Car";
        this.acceleration = 5;
    }

    @Override
    public String toString(){
        return "Boat engine started: " + this.started + ", speed: " + this.speed +" Km/h";
    }

}
