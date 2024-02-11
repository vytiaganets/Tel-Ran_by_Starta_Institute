//Есть абстрактный класс ПочтовоеОтправление, в котором представлен набор характеристик:
//наименование;
//адрес отправителя;
//адрес получателя;
//и абстрактное поведение:
//доставить;
//отправить;
//Реализуйте методы этого абстрактного класса в его потомках
//Письмо, Бандероль, Посылка, Контейнер с учетом той специфики, которая характерна для каждого типа почтовых отправлений на Ваше усмотрение.
package de.telran.home20240125.post;

public class SimplePost {
    public static void main(String[] args) {
        Mailing mailing = new Letter("Dresden", "Ottawa", "Kiel");
        mailing.deliver();
        mailing.send();
        mailing = new Parcel("Berlin","London", "Kiel");
        mailing.deliver();
        mailing.send();
        mailing =new Package("Washington","Kiel", "Kiel");
        mailing.deliver();
        mailing.send();
        mailing =new Container("Rome","Glasgow", "Kiel");
        mailing.deliver();
        mailing.send();
        //Address receiver for letter: Kiel
        //Address sender for letter: Ottawa
        //Address receiver for parcel: Kiel
        //Address sender for parcel: London
        //Address receiver for package: Kiel
        //Address sender for package: Kiel
        //Address receiver for container: Kiel
        //Address sender for container: Glasgow
    }

}
