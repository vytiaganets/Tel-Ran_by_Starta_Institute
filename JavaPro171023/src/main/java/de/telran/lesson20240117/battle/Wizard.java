package de.telran.lesson20240117.battle;
//force1 = hero1.force + hero1.weapon.force
//force2 = hero2.force + hero2.weapon.force
//5. Создать класс Wizard - волшебник. Реализовать у волшебника
//        - методы heal(Superhero hero), heal(Superhero[] heroes) исцеления раненых персонажей
//        - методы increaseForce(Superhero hero), increaseForce(Superhero[] heroes) увеличения силы персонажей.
//        Сила увеличивается пропорционально уровню (поле level) волшебника по формуле force * 0.1 * level
//        6. В классы Superhero и Wizard добавить метод introduce(), который выводил бы в консоль тест приветствия персонажа.
//        По умолчанию приветствие выводится в виде "Hi, I'm Batman!".
//        Однако должна быть возможность каждому персонажу задавать свой особенный текст.

//https://github.com/IliaIliukovich/practice-171023
//7. Добавить абстрактный класс Character. Вынести в него поля name, message, метод introduce().
//Все персонажи игры должны быть его наследником.
//8. Добавить абстрактный класс CombatCharacter. Вынести в него поле health.
//Добавить в него следующие методы
//- public abstract int countForce();
//- public abstract int countProtectionLevel();
//- public void fight(CombatCharacter another)
//Все сражающиеся персонажи игры должны быть его наследником.
//9. Создать класс EvilCreature.
//EvilCreature умеет сражаться, обладает силой и защитой, но не имеет доспехов и оружия.
//У EvilCreature есть поле boolean isAngry.
//Когда существо злое, его сила и наносимый урон здоровью противника удваивается.
public class Wizard {
    private String name;
    private int level;
    private String message;

    public Wizard(String name, int level) {
        this.name = name;
        this.level = level;
        this.message = "Hi, I' am " + name;
    }

    public Wizard(String name, int level, String message) {
        this.name = name;
        this.level = level;
        this.message = message;
    }

    public void heal(Superhero hero) {
        if (hero.getHealth() == 100) {
            System.out.println(hero.getName() + " is healthy. Nothing to heal");
        } else {
            hero.setHealth(100);
            System.out.println(hero.getName() + " has been healed");
        }
    }

    public void heal(Superhero[] heroes) {
        for (Superhero superhero : heroes) {
            heal(superhero);
        }
    }

    public void increaseForce(Superhero superhero) {
        int force = superhero.getForce();
        force = force + (int) (force * 0.1 * level);
        superhero.setForce(force);
    }

    public void increaseForce(Superhero[] superheroes) {
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

    public void introduce() {
        System.out.println(message);
    }
}
//. создать класс wizard - волшебник. Реализовать у волшебника
//методы heal (Superhero hero), heal (Superhero [] heroes) исцеления раненых персонажей
//методы increaserorce Superhero hero, increaserorce superhero heroes увеличения силы персонажеи.
//Сила увеличивается пропорционально уровню (поле level) волшебника по формуле force * 0.1 * level
//force = 10
//level
//0 + 10 * 2 * 0.1 = 12
//6. В классы Superhero и Wizard добавить метод introduce (), который выводил бы в консоль тест приветствия персонажа.
//По умолчанию приветствие выводится в виде "Hi, I'm Batman!".
//Однако должна быть возможность каждому персонажу задавать свой особенный текст.
//Wizard wizard = new Wizard ("Name", 10, "I'm wizard. I can do magic");
//wizard.introduce ();
//Wizard wizard2 = new Wizard ("Name", 10);
//wizard.introduce ();
//wizard.heal(jack);