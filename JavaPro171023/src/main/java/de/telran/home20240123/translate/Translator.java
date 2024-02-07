//Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
//Например с английского на русский, с русского на немецки и т.п.
//Продумайте какова архитектура наследования будет в данном приложении.
package de.telran.home20240123.translate;

public abstract class Translator {
    private String name;
    private int age;
    private String gender;

    public Translator() {
    }

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    abstract void canTranslate();

    @Override
    public String toString() {
        return "Translator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
