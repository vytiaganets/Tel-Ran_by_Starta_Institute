//Есть класс Авто со свои набором характеристик и поведения.
//Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику, а какие простому Водителю.
//Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ к методам класса Авто.
package de.telran.home20240123.auto;

public class SimpleAuto {
    public static void main(String[] args) {
        Auto bmw = new Auto("red", "20",200, 1000);
        AutoMechanic autoMechanic = bmw;
        AutoDriver autoDriver = bmw;
        System.out.println(bmw);
        System.out.println("Auto driver: model: " + autoDriver.getModel()+ ", speed: " + autoDriver.getSpeed());
        System.out.println("Auto mechanic: model: "+autoMechanic.getModel() + ", speed: "+ autoDriver.getSpeed());
        //Auto{color='red', model='20', speed=200, power=1000}
        //Auto driver: model: 20, speed: 200
        //Auto mechanic: model: 20, speed: 200
    }
}
