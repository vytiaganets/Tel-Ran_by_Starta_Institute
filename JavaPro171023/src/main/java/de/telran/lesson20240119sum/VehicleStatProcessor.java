package de.telran.lesson20240119sum;

public class VehicleStatProcessor {

  static void countBlackVehicles(Vehicle[] vehicles){
        int blackVehicles = 0;
        for(Vehicle vehicle : vehicles){
            if(vehicle.color.equals("Black")){
                blackVehicles++;
            }
        }
        System.out.println("Black vehicles = " + blackVehicles);
    }
}
