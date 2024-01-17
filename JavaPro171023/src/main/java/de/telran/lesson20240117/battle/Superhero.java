package de.telran.lesson20240117.battle;

public class Superhero {
    private String name;
    private int health;
    private int force;
    private Weapon weapon;
    private Protection protection;

    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force < 0)
            throw new RuntimeException("Force cannot be less than 0");
        this.force = force;
    }

    @Override
    public String toString() {
        return "Hero='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }
}
