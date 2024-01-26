package de.telran.lesson20240126sum.shape.equal;

public class AirportType implements Hub {
    //@Override
    public boolean canUse(Vehicle vehicle){
        if(vehicle instanceof Plane || vehicle instanceof Helikopter){
            return true;
        } else {
            return false;
        }
    }
}
