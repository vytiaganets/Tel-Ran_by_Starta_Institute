//Имеется переключатель, который умеет переключать лампочки.
//Сделать класс переключателя универсальным, так чтобы его экземпляры
//были способным переключать осветительные приборы разного вида.
package de.telran.lesson20240513practice.dependencyinversion;

public class Switcher {
    private Switchable switchable;

    public Switcher(Switchable switchable) {
        this.switchable = switchable;
    }

    public void switchOn() {
        switchable.on(true);
    }

    public void switchOff() {
        switchable.on(false);
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher(new Lamp());
        switcher.switchOn();
        switcher.switchOff();

        Switcher switcher2 = new Switcher(new DeskLamp());
        switcher2.switchOn();
        switcher2.switchOff();
        //Lamp is: on
        //Lamp is: off
        //Desk lamp is: on
        //Desk lamp is: off
    }
}
