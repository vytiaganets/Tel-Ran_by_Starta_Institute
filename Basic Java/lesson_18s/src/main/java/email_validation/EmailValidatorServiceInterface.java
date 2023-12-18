package main.java.email_validation;

    public interface EmailValidatorServiceInterface {
        boolean isEmailValid(String email);

        boolean isEmailValid(String email, boolean isStaff);
    }