package de.telran.home20240123.auto;

public class Auto implements AutoDriver, AutoMechanic {
    private String color;
    private String model;
    private int speed;
    private int power;

    public Auto(String color, String model, int speed, int power) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", power=" + power +
                '}';
    }
}
