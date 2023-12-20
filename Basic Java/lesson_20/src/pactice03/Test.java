package pactice03;

public class Test {
    public static void main(String[] args) {
        Dog alpha = new Dog();
        alpha.setName("Alpha");
        alpha.setBread("Dog");
        alpha.setAge(5);
        System.out.println(alpha.getName());
        System.out.println(alpha.getAge());
        System.out.println(alpha.getBread());
        alpha.bark();
    }
}
