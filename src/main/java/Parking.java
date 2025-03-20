import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Parking implements ICommand {

    private Vehicle obj = null;
    protected Queue<String> orderList = new LinkedList<String>();

    public void start() {
        obj.started=true;
    }

    public void accelerate() {
        obj.increaseVelocity();
    }

    public void brake() {
        obj.decreaseVelocity();
    }

    public void execute() {
        if(!this.orderList.isEmpty()){
            for(String order : this.orderList){
                this.execute(order);
            }
        }
    }

    @Override
    public void execute(String instruction) {
        switch (instruction) {
            case "s" -> this.start();
            case "a" -> this.accelerate();
            case "b" -> this.brake();
        }
    }

    public Parking(Vehicle obj) {
        this.obj = obj;
    }

    public Parking(Vehicle obj, String instruction) {
        this.obj = obj;
        this.execute(instruction);
    }

    public void setOrderList(String[] orderList) {
        this.orderList = new LinkedList(Arrays.asList(orderList));
    }
}
