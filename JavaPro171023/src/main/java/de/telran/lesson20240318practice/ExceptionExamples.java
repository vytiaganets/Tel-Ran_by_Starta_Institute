//1. Напишите метод, который принимает целое число в качестве параметра и выдает проверяемое исключение, если число нечетное.
//2. Написать метод проверки введенного пароля. Если пароль неверен, выбрасывается проверяемое исключение
//WrongPasswordException с сообщением "Password is wrong".
//3. Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
//public static void method1() {
//System.out.println (1 / 0);
//}
//public static void method20) {
//throw new NullPointerException("nulls everywhere!");
//}
//public static void method3() throws IOException {
//throw new IOException ("File not found");
//Отловить эти исключения и выбросить вместо них MyAppException, который содержал бы информацию о типе исходного исключения и его сообщение.

//1. Write a method that takes an integer as a parameter and throws a checked exception if the number is odd.
//2. Write a method for checking the entered password. If the password is incorrect, a checked exception is thrown
//WrongPasswordException with the message "Password is wrong".
//3. One method calls three other methods, which throw checked and unchecked exceptions:
//public static void method1() {
//System.out.println (1 / 0);
//}
//public static void method20) {
//throw new NullPointerException("nulls everywhere!");
//}
//public static void method3() throws IOException {
//throw new IOException ("File not found");
//Catch these exceptions and throw a MyAppException instead, which would contain information about the type of the original exception and its message.
package de.telran.lesson20240318practice;

public class ExceptionExamples {
    public static void main(String[] args) {
        try {
            method();
        } catch (NullPointerException | ArithmeticException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
        } finally{
            System.out.println("finally block");
        }
        System.out.println("Some code later");
//my message
//finally block
//Some code later
    }
    public static void method(){
        //System.out.println(1/0);
        throw new NullPointerException("my message");
    }
}
