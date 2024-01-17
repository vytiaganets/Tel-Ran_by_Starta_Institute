package de.telran.lesson20240117.battle;

//    Superhero battle
//    Superhero class:
//            - name String
//- health int
// force int
//- Weapon class: - name String
//- force int
//- Protection class: - name String
//- level int
//    методы:
//            - static generateRandomSuperHero ()
//- fight ()
//----> health = health - (force1 - force2) / level
//    1. Создать 3 класса Superhero, Weapon, Protection
//    2. Создать несколько персонажей SuperheroBattle main()
//    3. Реализовать методы generateRandomSuperHero(), fight()
//fight(Superhero another)
//fight(Superhero one, Superhero two)
//    4. Продемонстрировать сражение
public class SuperheroBattle {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 5);
        Protection helmet = new Protection("Helmet", 2);
        Superhero spiderman = new Superhero("Spiderman", 2, sword, helmet);

        Weapon gun = new Weapon("Gun", 1);
        Protection jacket = new Protection("Jacket", 1);
        Superhero batman = new Superhero("Spiderman", 3, gun, jacket);

        System.out.println(spiderman);
        System.out.println(batman);

        Protection randomProtection = Protection.generateRandomProtection();
        System.out.println(randomProtection);
    }
}
