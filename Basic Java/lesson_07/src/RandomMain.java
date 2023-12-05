import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        int upperRound = 11;
        int intRandom = random.nextInt(upperRound);
        System.out.println(intRandom);//7
        float floatRandom = random.nextFloat();
        System.out.println(floatRandom);//0.8710115
        double doubleRandom = random.nextDouble();
        System.out.println(doubleRandom);//0.05119580630548637
        float floatRandomNum = random.nextFloat();
    }
}
