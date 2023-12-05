public class Cat {
    private String name;
    private int age;
    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void getName(){
        System.out.println("Cat's name is: " + this.name);
    }
    public int getAge(){
        return this.age;
    }
}
