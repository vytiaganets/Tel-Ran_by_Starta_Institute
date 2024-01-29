//2.Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.
package de.telran.home20240116;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public java.lang.String getNumber() {
        return number;
    }

    public void receiveCall(String inCall){
        System.out.println("Call " + inCall );
    }
    public  void  printVariable(String nameClass) {
        System.out.println("Class -> "+nameClass + " Variables: ->number: "+number+" ->model: "+model+" ->weight: "+weight);
    }
}
