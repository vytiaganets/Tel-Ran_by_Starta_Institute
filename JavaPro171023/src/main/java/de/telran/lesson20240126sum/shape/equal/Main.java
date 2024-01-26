package de.telran.lesson20240126sum.shape.equal;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Helikopter helikopter1 = new Helikopter();
        Helikopter helikopter2 = new Helikopter();
        Helikopter helikopter3 = new Helikopter();
        AirportType airportType = new AirportType();
        boolean result1 = airportType.canUse(bus1);
        System.out.println(result1);
        boolean result2 = airportType.canUse(plane1);
        System.out.println(result2);
        boolean result3 = airportType.canUse(train1);
        System.out.println(result3);
        boolean result4 = airportType.canUse(helikopter1);
        System.out.println(result4);

        RailwayStationType railwayStationType = new RailwayStationType();

        calculateTransportObjectsPerHub(new Hub[] {airportType, railwayStationType}, new Vehicle[] {plane1, train1});
    }
    static void calculateTransportObjectsPerHub(Hub[] hubs, Vehicle[] vehicles){
        int planeCount = 0;
        int trainCount = 0;
        int busCount = 0;
        for (Vehicle vehicle : vehicles) {
            for (Hub hub : hubs) {
                if (hub.canUse(vehicle) && hub instanceof AirportType) {
                    ++planeCount;
                } else if (hub.canUse(vehicle) && hub instanceof BusStationType) {
                    ++busCount;
                } else if (hub.canUse(vehicle) && hub instanceof RailwayStationType) {
                    ++trainCount;
                }
            }
        }
        System.out.println(planeCount);
        System.out.println(busCount);
        System.out.println(trainCount);
    }

}
