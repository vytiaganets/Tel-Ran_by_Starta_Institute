//Создайте 5 объектов типа Car
//        Объект Car должен содержать поля
//private double price;
//private String model;
//        и конструктор с этими полями
//        Сохраните объекты в массив
//        Распечатайте результат
//        Результат печати одного авто должен выглядеть:
//        Car - BMW, price = 2.3
//        Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
//        Распечатайте результат
//        Применив метод “сортировка пузырьком” отсортируйте массив по модели (первая буква из модели)
//        Распечатайте результат


public class Car {
    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
