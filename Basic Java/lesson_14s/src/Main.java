public class Main {

    public static void main(String[] args) {

        print(75, 20);

        print(45, 20);

        print(75, 10);

    }

    public static boolean isRentner(int age, int workingJears){

        return (age > 65 && workingJears > 15) || (age > 70);

    }



    public static void print(int age, int workingJears) {

        if (isRentner(age, workingJears)){

            System.out.println("Вы пенсионер ");

        }

        else {

            System.out.println("Вы не пенсионер ");

        }

    }

}