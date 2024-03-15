//Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//Login:
//1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
//2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Password:
//1) Длина password должна быть меньше 20 символов.
//2*) Должен содержать только латинские буквы, цифры.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с  конструкторами:
//1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны или false в другом случае.
//Обработка исключений проводится в вызывающем методе.

//Create a static method that takes three parameters as input: login, password and confirmPassword.
//Login:
//1) The length of login must be less than 20 characters and begin with a Latin letter.
//2*) Login must contain only Latin letters, numbers and underscores.
//If login does not meet these requirements, a WrongLoginException must be thrown.
//Password:
//1) The length of password must be less than 20 characters.
//2*) Must contain only Latin letters and numbers.
//Also password and confirmPassword must be equal.
//If the password does not meet these requirements, a WrongPasswordException must be thrown.
//WrongPasswordException and WrongLoginException - custom exception classes with constructors:
//1) one by default;
//2*) the second one receives the exception message and passes it to the constructor of the Exception class.
//The method returns true if the values are true or false otherwise.
//Exception handling is carried out in the calling method.
package de.telran.home20240314;
import static java.lang.System.exit;
public class SimpleExceptions {
    public static void main(String[] args) {
        String login = "Tel_-";
        String password = "ran";

        String confirmPassword = "ran";
        //String password = "_ran";
        //String confirmPassword = "_ran";
        //Пароль не соответствует требованиям.
        boolean result = false;
        try {
            result = error(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(result);
            System.out.println(e.getMessage());
            exit(1);
        }
        try {
            result = error(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println(result);
            System.out.println(e.getMessage());
            exit(1);
        }
        System.out.println(result);//true
    }

    public static boolean error(String login, String password, String confirmPassword) {
        if (!login.matches("^[a-zA-Z0-9_]{0,19}$")) {
            throw new WrongLoginException("Логин не соответствует требованиям.");
        }
        if (!password.matches("^[a-zA-Z0-9]{0,19}$")){
            throw new WrongPasswordException("Пароль не соответствует требованиям.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Подтвердите пароль.");
        }
        return true;
    }
}