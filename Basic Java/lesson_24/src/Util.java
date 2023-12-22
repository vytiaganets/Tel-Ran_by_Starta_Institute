public class Util {
    public static void bubbleSortByPrice(Car[] cars) {
        boolean isSorted = false;
        Car temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getPrice() > cars[i + 1].getPrice()) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static void bubbleSortByModel(Car[] cars) {
        boolean isSorted = false;
        Car temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getModel().charAt(0) > cars[i + 1].getModel().charAt(0)) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
