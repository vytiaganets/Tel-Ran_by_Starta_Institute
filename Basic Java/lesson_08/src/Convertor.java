import java.util.Scanner;

public class Convertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цельсий: ");
        int cls = sc.nextInt();
        double kl = runKelvinConvertor(cls);
        System.out.println("Температура в кельвинах: " + kl);
        double fr = runFarengeitConvertor(cls);
        System.out.println("Температура в фаренгейтах: " + fr);

    }
    public static double runKelvinConvertor(double baseValue){
        return baseValue + 273.15;
    }
    public static double runFarengeitConvertor(double baseValue){
        return baseValue * 1.8 + 32;
    }
    }
