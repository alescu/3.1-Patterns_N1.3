public class Plane extends Vehicle {

    public Plane() {
        this.name="Plane";
        this.acceleration = 100;
    }

    @Override
    public String toString(){
        return "Plane engine started: " + this.started + ", speed: " + this.speed +" Km/h";
    }
}
