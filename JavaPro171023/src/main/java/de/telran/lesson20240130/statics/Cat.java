package de.telran.lesson20240130.statics;

public class Cat {
    private String name = "Noname";
    // блок инициализации
    {
        age = 10;
    }
    private int age;
    static final int COUNT_LEGS = 4;//константа
    static private int countEars = 2;
    static int weigh; // только статические переменные
    //статический блок инициализации
static {
    countEars = 10;
}
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weigh = this.age * 2;//при создании обьекта это возможно

        //countLegs = 10; //нельзя изменить при final
    }

    @Override
    public String toString() {
        return "Cat { name = " + name + '\'' +
                ", age =" + age +
                ", countEars = " + countEars +
                "}";
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

    public static int getCountEars() {
        return countEars;
    }

    public static void setCountEars(int countEars) {
        Cat.countEars = countEars;
    }

    public static void getCountEars(int countEars) {
        Cat.countEars = countEars;
    }

    public static boolean isRunSpeed() {//работает только со статическими переменными и методами
        return (weigh * COUNT_LEGS <= 30) ? false : true;
    }
}
