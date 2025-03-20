import java.util.ArrayList;
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

        List<Parking> remoteControlerList = new ArrayList<Parking>();

        Parking carRC = new Parking(car);
        carRC.setOrderList(new String[] {"a"});
        remoteControlerList.add(carRC);


        Parking boatRC = new Parking(boat,"s");
        boatRC.setOrderList(new String[] {"a","a"});
        remoteControlerList.add(boatRC);


        Parking bikeRC = new Parking(bike);
        bikeRC.setOrderList(new String[] {"a","a","a","a","a","a"});
        remoteControlerList.add(bikeRC);

        Parking planeRC = new Parking(plane,"s");
        remoteControlerList.add(planeRC);

        for(Parking rc : remoteControlerList){
            rc.execute();
        }
        System.out.println("\n Primeres instruccions.");
        System.out.println(bike.toString());
        System.out.println(boat.toString());
        System.out.println(car.toString());
        System.out.println(plane.toString());

        System.out.println("\n Segones instruccions");

        boatRC.setOrderList(new String[] {"s","a","a","a","a"});
        carRC.setOrderList(new String[] {"s","a","a"});
        bikeRC.setOrderList(new String[] {"b","b"});
        planeRC.setOrderList(new String[] {"a","a","a","a","a","a","a","a","a","a","a","a","a","a"});

        remoteControlerList.add(boatRC);
        remoteControlerList.add(carRC);
        remoteControlerList.add(bikeRC);
        remoteControlerList.add(planeRC);

        for(Parking rc : remoteControlerList){
            rc.execute();
        }

        System.out.println(bike.toString());
        System.out.println(boat.toString());
        System.out.println(car.toString());
        System.out.println(plane.toString());
    }
}
