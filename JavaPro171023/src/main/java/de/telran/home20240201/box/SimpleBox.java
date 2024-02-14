//У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина. В коробку вы можете положить любой объект (главное чтобы он влез по габаритам) и его отправить по почте или получить по почте.
//Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход? Если да, попробуйте реализовать данный класс.
package de.telran.home20240201.box;

public class SimpleBox {
    public static void main(String[] args) {
        Box<Exemplar> exemplarBox1 = new Box<>(10, 10, 10);
        Exemplar phone = new Exemplar(2, 2, 2, "phone");
        Box<Exemplar> exemplarBox2 = new Box<>(20, 20, 20);
        Exemplar pencil = new Exemplar(1, 1, 1, "pencil");
        if(exemplarBox1.putExemplar(phone)){
            System.out.println(exemplarBox1.getExemplar().getName());
            //phone in box.
            //phone
        }
        if(exemplarBox2.putExemplar(pencil)){
            System.out.println(exemplarBox2.getExemplar().getName());
            //pencil in box.
            //pencil
        }
    }
}
