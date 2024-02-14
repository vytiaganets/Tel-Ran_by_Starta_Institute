//Вы владелец концертного зала со сценой. Вы нанимаете артистов различного жанра, которые развлекают зрителей, используя свои таланты. Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать зрителей используя свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход к реализации?
package de.telran.home20240201.theater;

public class SimpleConcert {
    public static void main(String[] args) {
    Concert<Artists> concert = new Concert<>();
    concert.addArtist(new Clown());
    concert.begin();//This is clown.
    }
}
