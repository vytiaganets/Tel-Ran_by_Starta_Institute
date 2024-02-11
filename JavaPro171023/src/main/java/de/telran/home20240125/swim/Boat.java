package de.telran.home20240125.swim;
public class Boat implements Swim {
    private int speed;

    public Boat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Boat{" +
                "speed=" + speed +
                '}');
    }
}
