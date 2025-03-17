public class Bicycle extends Vehicle {

    public Bicycle() {
        this.name="Bicycle";
        haveEngine = false;
        started = true;
        this.acceleration = 1;
    }

    @Override
    public String toString(){
        return "Bicycle speed: " + this.speed;
    }

}
