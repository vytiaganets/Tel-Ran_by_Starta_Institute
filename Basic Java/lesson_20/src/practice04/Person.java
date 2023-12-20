package practice04;

//Создайте класс Person
//        Определите свойство класса name с модификатором private
//Определите конструктор с параметром name
//        Переопределите toString(), таким образом, чтобы выводилось “Name is …”
//        Переопределите hashCode(), таким образом, чтобы hashCode всегда был равен 10
//        Переопределите equals(), таким образом, чтобы сравнение было только с входящим объектом
public class Person {
    private String name;
    private Integer age;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return "name is " + this.name;
    }
    @Override
    public int hashCode() {
        return 10;
    }
//    @Override
//    public boolean equals(Objects o){
//        return this==o;
//    }
@Override
    public boolean equals(Object o){
        return this==o;
    }
}
