package de.telran.home20240123.translate;

public class EnglishUkrainian extends Translator {
    public EnglishUkrainian() {
    }

    public EnglishUkrainian(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void canTranslate() {
        System.out.println("Перевод: " + this.getName() + ", возраст: " + this.getAge() + ", пол " + this.getGender());
        System.out.println(this.getName() + " может переводить с английского на украинский язык.");
    }
}
