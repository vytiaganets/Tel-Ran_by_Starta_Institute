package de.telran.lesson20240119summary;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        double c = 0.1;
//        Integer b = 2;
        // эквивалент
        //Integer b1 = new Integer(2);
        //Integer d1 = new Integer(3);
//        System.out.println("Hello!");
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
//        Teachers anton = new Teachers();
//        anton.name = "Anton";
//        anton.age = 35;
//        Teachers ivan = new Teachers();
//        ivan.name = "Ivan";
//        ivan.age = 31;
//        Teachers vasya = new Teachers();
//        System.out.println(anton.name);
//        System.out.println(ivan.name);
//        System.out.println(vasya.name);
        Car fordCar = new Car("123", "Ford", "Black", 180, 2005, 4, "sedan");
        Motocycle hondaBike = new Motocycle("234", "Honda", "red", 150, 2020, "bike");
        VehicleStatProcessor.countBlackVehicles(new Vehicle[] {fordCar, hondaBike});
    }

}
