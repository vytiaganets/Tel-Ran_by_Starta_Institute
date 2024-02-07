package de.telran.lesson20240126summary.shape.equal;

public class BusStationType implements Hub{
    public boolean canUse(Vehicle vehicle){
        if(vehicle instanceof Train){
            return true;
        } else {
            return false;
        }
    }
}
