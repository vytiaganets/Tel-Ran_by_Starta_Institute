package main.java.email_validation;

public class EmailServiceTest {
    public static void main(String[] args) {
        EmailValidatorService emailValidatorService = new EmailValidatorService();

        boolean isValid1 = emailValidatorService.isEmailValid("vedenin111@gmail.com");
        System.out.println("email vedenin111@gmail.com, result " +  isValid1);

        boolean isValid2 = emailValidatorService.isEmailValid("vedenin111$mail,com");
        System.out.println("email vedenin111$mail,com, result " +  isValid2);

        boolean isValid3 = emailValidatorService.isEmailValid("vedenin111@mail,com");
        System.out.println("email vede.nin.111@mail,com, result " +  isValid3);
        boolean isValid4 = emailValidatorService.isEmailValid("vedenin111@gmail.com", true);
        System.out.println("email vedenin111@gmail.com, result " +  isValid4);

        boolean isValid5 = emailValidatorService.isEmailValid("vedenin111@oUr_Domain.com ", true);
        System.out.println("email vedenin111@our_domain.com, result " +  isValid5);

    }
}