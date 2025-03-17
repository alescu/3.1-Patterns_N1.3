import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args){

        /*
        Command:
        Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.

        Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar
        i frenar per a cada tipus de vehicle.
         */

        Bicycle bike = new Bicycle();
        Boat boat = new Boat();
        Car car = new Car();
        Plane plane = new Plane();
        /*
        Collection<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(bike);
        vehicleList.add(boat);
        vehicleList.add(car);
        vehicleList.add(plane);
        */

        List<RemoteControler> remoteControlerList = new ArrayList<RemoteControler>();

        RemoteControler carRC = new RemoteControler(car);
        carRC.setOrderList(new String[] {"a"});
        remoteControlerList.add(carRC);


        RemoteControler boatRC = new RemoteControler(boat,"s");
        boatRC.setOrderList(new String[] {"a","a"});
        remoteControlerList.add(boatRC);


        RemoteControler bikeRC = new RemoteControler(bike);
        bikeRC.setOrderList(new String[] {"a","a","a","a","a","a"});
        remoteControlerList.add(bikeRC);

        RemoteControler planeRC = new RemoteControler(plane,"s");
        remoteControlerList.add(planeRC);

        for(RemoteControler rc : remoteControlerList){
            rc.execute();
        }
        System.out.println("\n");
        System.out.println(bike.toString());
        System.out.println(boat.toString());
        System.out.println(car.toString());
        System.out.println(plane.toString());

        System.out.println("\n");

        boatRC.setOrderList(new String[] {"s","a","a","a","a"});
        carRC.setOrderList(new String[] {"s","a","a"});
        bikeRC.setOrderList(new String[] {"b","b"});
        planeRC.setOrderList(new String[] {"a","a","a","a","a","a","a","a","a","a","a","a","a","a"});

        remoteControlerList.add(boatRC);
        remoteControlerList.add(carRC);
        remoteControlerList.add(bikeRC);
        remoteControlerList.add(planeRC);

        for(RemoteControler rc : remoteControlerList){
            rc.execute();
        }

        System.out.println(bike.toString());
        System.out.println(boat.toString());
        System.out.println(car.toString());
        System.out.println(plane.toString());
    }
}
