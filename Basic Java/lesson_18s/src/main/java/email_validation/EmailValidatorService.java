package main.java.email_validation;

public class EmailValidatorService implements EmailValidatorServiceInterface {

    public static final String OUR_DOMAIN = "our_domain.com";

    public boolean isEmailValid(String email) {
        return isDogContains(email) && isDotAfterDog(email);
    }

    public boolean isEmailValid(String email, boolean isStaff) {
        if(isStaff) {
            return isEmailValid(email) && email.trim().toLowerCase().endsWith(OUR_DOMAIN); // trim - удаляет проблеы с
            // начала и конца строки, toLowerCase - меняет регистор на нижнний
            // endsWith - сравнивает с концом строки
        }
        return isEmailValid(email);
    }


    private static boolean isDogContains(String email) {
        return email.contains("@"); // contains - проверяет есть ли подсрока
    }

    private static boolean isDotAfterDog(String email) {
        int i = email.indexOf("@"); // найти индекс первой подстроки
        return email.substring(i).contains("."); // substring - возвращает подстраку,
    }
}