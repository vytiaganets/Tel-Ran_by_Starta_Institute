package de.telran.lesson20240126summary.shape.equal;

public class RailwayStationType implements Hub{
    @Override
    public boolean canUse(Vehicle vehicle){
        if(vehicle instanceof RailwayStation){
            return true;
        } else {
            return false;
        }
    }
}
