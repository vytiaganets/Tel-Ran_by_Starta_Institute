public class Task2 {

// 1. Создайте класс ручка (Pen)
//    a. Определите свойство color типа String с доступом private b. Создайте методы getColor(); setColor(String newColor);
//2. Создайте класс Test
//3. Создайте три объекта типа Pen
//4. Создайте массив L = 3
//            5. Сохраните все объекты в массив
//6. Достаньте поочередно из массива ручки и измените цвет каждой на
//    a. “Green” b. “Red” c. “Black”
//            7. Инициализируйте массив числами от 1 до 10 используя способ литерала
//8. Выведите на консоль элемент из второй ячейки
//9. Распечатайте на консоль все элементы из ячеек массива
//10. Проанализируйте выход в консоле
//11. Распечатайте цвета ручек из массива
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("green");

        Pen p2 = new Pen();
        p2.setColor("red");

        Pen p3 = new Pen();
        p3.setColor("black");

        Pen[] pens = new Pen []{
                p1, p2, p3
        };
        for (int i = 0; i<pens.length; i++){
            System.out.println(pens[i].getColor());
        }
        for (int i = 0; i<pens.length; i++){
            pens[i].setColor("white");
        }
        for (int i = 0; i<pens.length; i++){
            System.out.println(pens[i].getColor());// пустые места
        }
    }
}
//    green
//            red
//    black
//            white
//    white
//            white
//public class Pen {
//
//    private String color;
//
//    public void setColor(String newColor) {
//        this.color = newColor;
//    }
//    public String getColor() {
//        return this.color;
//    }
//}
//public class Task2 {
//    public static void main(String[] args) {
//
//        Pen p1 = new Pen();
//        p1.setColor("green");
//
//        Pen p2 = new Pen();
//        p2.setColor("red");
//
//        Pen p3 = new Pen();
//        p3.setColor("black");
//
//        Pen[] pens = new Pen [] {
//                p1, p2, p3
//        };
//
//        for (int i =0; i < pens.length; i++) {
//            System.out.println(pens[i].getColor());
//        }
//
//        for (int i = 0; i < pens.length; i++) {
//            pens[i].setColor("white");
//        }
//
//        for (int i =0; i < pens.length; i++) {
//            System.out.println(pens[i].getColor()); // пустые места
//        }
//
//
//    }
//    Pen[] pens = new Pen [3];
//    pens[0] = p1;
//    pens[1] = p2;
//    pens[2] = p3;
//  Pen[] pens = new Pen [] {p1, p2, p3};