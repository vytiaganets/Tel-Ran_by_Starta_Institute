//2. Написать метод проверки введенного пароля. Если пароль неверен, выбрасывается проверяемое исключение
//WrongPasswordException с сообщением "Password is wrong".
package de.telran.lesson20240318practice;

public class Task2 {
    public static void main(String[] args) {
        String correctPassword ="12345";
        String passwordFromUser="1234";
        try {
            checkPassword(passwordFromUser, correctPassword);
        } catch (WrongPasswordException e){
            System.out.println("Try again. You have three attempts.");
            e.printStackTrace();//Password is wrong
        }
        //Try again. You have three attempts.
    }
    public static void checkPassword (String passwordFormUser, String correctPassword) throws WrongPasswordException{
        if(!correctPassword.equals(passwordFormUser)){
            throw new WrongPasswordException("Password is wrong");
        }
    }
}
