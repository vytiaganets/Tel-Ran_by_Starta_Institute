package de.telran.lesson20240118;

public final class UnicornRace extends Unicorn {
    int countPassenger;

    public UnicornRace() {
    }
    public UnicornRace (String name, int weight, String color, int countHorn, int countPassenger) {
        super(name, weight, color, countHorn);
        this.countPassenger = countPassenger;
    }


    public void transpotsPassenger(){
        System.out.println("единорог по имени "+name +
                " везет "+countPassenger +
                " пассажиров");
   }

}
