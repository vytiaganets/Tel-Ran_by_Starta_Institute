package de.telran.lesson20240126sum.shape.equal;

public class BusStationType implements Hub{
    public boolean canUse(Vehicle vehicle){
        if(vehicle instanceof Train){
            return true;
        } else {
            return false;
        }
    }
}
