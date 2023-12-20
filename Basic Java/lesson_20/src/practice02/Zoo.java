package practice02;

public class Zoo {
    private Monkey monkey;
    public String getMonkey(){
        Monkey monkey1 = new Monkey();
        return monkey1.name;
    }
    public int age = 20;
    public class Monkey{
        public String name = "Monkey";
        public class Banana{
            public String sort = "Yellow";

            public String getSort(){
                return this.sort;
            }
        }
    }
}
