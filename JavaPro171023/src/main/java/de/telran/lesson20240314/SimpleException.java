package de.telran.lesson20240314;

public class SimpleException {
    public SimpleException() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void main (String[] args) throws InterruptedException{
        int result = div(10, 0);
        if (result != Integer.MAX_VALUE) {
            System.out.println(result);
        } else {
            System.out.println("Error div");//Error div
        }
        result = divException(10, 0);
        System.out.println(result);

        try {
            result = divNoCatchError(10, 0);
            System.out.println(result);
        }
        catch (ArithmeticException er){
            System.out.println(er.getMessage());
            result = divNoCatchError(10,2);
        }
        System.out.println(result);

        try{
            result = div(10,0);
        } catch (RuntimeException e) {
            System.out.println("вывод инфо о предке: " + e.getCause().getMessage());// вывод инфо о предке
        }

        //пользовательское исключение
        //custom exception
        System.out.println("======custom exception======");
        try {
            result = divUserException(10, 0);
            System.out.println(result);
        } catch (MyException ex){
            System.out.println(ex.getMessage());//Второй аргумент не может быть 0
        }

        try{
            result = divExceptionUserCause(10, 0);
        }
        catch (MyException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause().getMessage());
        }
        System.out.println(" End program ");
    }

    static int div(int arg1, int arg2) {
        if (arg2 == 0) {
            return Integer.MAX_VALUE;
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){// InterruptedException отслеживаемое исключение
            throw new RuntimeException();//RuntimeException не отслеживаемое исключение
            //ex.getCause();
        }

        return arg1 / arg2;
    }

    static int divExceptionUserCause(int arg1, int arg2) {
        try {
            return arg1 / arg2;
        } catch (
                ArithmeticException ex) {
            System.out.println(ex.getMessage());/// by zero
            throw new MyException("Не ноль", ex);
            //return Integer.MAX_VALUE;//2147483647
        }
    }

    static int divException(int arg1, int arg2) {
        try {
            return arg1 / arg2;
        } catch (
                ArithmeticException ex) {
            System.out.println(ex.getMessage());/// by zero
            return Integer.MAX_VALUE;
        }
    }

    static int divNoCatchError(int arg1, int arg2) throws InterruptedException{
        Thread.sleep(1000);

        return arg1 / arg2;
    }

    static int divUserException(int arg1, int arg2) {
        if (arg2 == 0) {
            throw new MyException("Второй аргумент не может быть 0");
        }
        return arg1 / arg2;
    }
}
