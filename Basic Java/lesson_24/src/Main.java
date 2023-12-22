import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Car audi = new Car(100000, "Q7");
        Car bmw = new Car(120000, "x7");
        Car mb = new Car(130000, "GLS");
        Car vw = new Car(140000, "golf gt");
        Car oka = new Car(10, "x");
        Car[] cars = new Car[] {audi, bmw, mb, vw, oka};

        System.out.println(Arrays.toString(cars));

        Util.bubbleSortByPrice(cars);
        System.out.println(Arrays.toString(cars));

        Util.bubbleSortByModel(cars);
        System.out.println(Arrays.toString(cars));

//        [Car{price=100000.0, model='Q7'}, Car{price=120000.0, model='x7'}, Car{price=130000.0, model='GLS'}, Car{price=140000.0, model='golf gt'}, Car{price=10.0, model='x'}]
//[Car{price=10.0, model='x'}, Car{price=100000.0, model='Q7'}, Car{price=120000.0, model='x7'}, Car{price=130000.0, model='GLS'}, Car{price=140000.0, model='golf gt'}]
//[Car{price=130000.0, model='GLS'}, Car{price=100000.0, model='Q7'}, Car{price=140000.0, model='golf gt'}, Car{price=10.0, model='x'}, Car{price=120000.0, model='x7'}]


    }
}