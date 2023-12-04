public class Cat {
    int age; // cat's age
    String name; // cat's name
    String sex;

    public Cat() {

    }

    public Cat(int ageCat, String nameCat) {
        this.age = ageCat;
        this.name = nameCat;
//        age = ageCat; //не принято так писать
//        name = nameCat;
    }

    public Cat(int ageCat, String nameCat, String sex) {
        this.age = ageCat;
        this.name = nameCat;
        this.sex = sex;

    }

}
