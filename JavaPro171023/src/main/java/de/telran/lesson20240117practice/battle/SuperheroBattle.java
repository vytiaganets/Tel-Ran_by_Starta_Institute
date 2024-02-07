package de.telran.lesson20240117practice.battle;

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
        Weapon sword = new Weapon("Sword", 15);
        Protection helmet = new Protection("Helmet", 2);
        //Superhero spiderman = new Superhero("Spiderman", 2, sword, helmet);
        Superhero jack = new Superhero("Jack", helmet, sword, 2, "Jack is main character in this battle...");

        Weapon gun = new Weapon("Gun", 50);
        Protection jacket = new Protection("Jacket", 1);
        //Superhero batman = new Superhero("Spiderman", 3, gun, jacket);
        Superhero william = new Superhero("William", jacket, gun, 3);

        //System.out.println(spiderman);
        //System.out.println(batman);

        System.out.println("Before fight: ");
        System.out.println(jack);
        System.out.println(william);
        jack.fight(william);
        System.out.println("After fight: ");
        System.out.println(jack);
        System.out.println(william);

        System.out.println("-----Fight with randomSuperHero-----");
        Superhero randomSupeHero = Superhero.generateRandomSuperHero();
        randomSupeHero.introduce();
        william.fight(randomSupeHero);

        //Protection randomProtection = Protection.generateRandomProtection();
        //System.out.println(randomProtection);

        Wizard wizard = new Wizard("Dumledor", 5);
        wizard.introduce();
        wizard.heal(jack);
        wizard.increaseForce(jack);
        System.out.println(jack);

        Wizard evilWizard = new Wizard("Evil wizard", 10, "Evil wizard has knowledge of dark magic");
        evilWizard.introduce();
    }
}
