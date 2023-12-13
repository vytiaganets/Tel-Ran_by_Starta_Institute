public class Ternarny {
    public static void main(String[] args) {


        int num = 10;
        boolean isPositive;
        boolean isPositive1;

        if(num>= 0){
            isPositive = true;
        } else  {
            isPositive = false;
        }

        isPositive1 = num >= 0 ? true : false;
        System.out.println(isPositive);//true
        System.out.println(isPositive1);//true
    }
}