public class MainMathRandom {
    public static void main(String[] args) {
        double rand = Math.random();
        //System.out.println(rand);//0.4291958398702862
        int min = 500;
        int max = 1000;
        int res = (int)(rand * (max -min + 1) + min);
        System.out.println(res);//747
        System.out.println((int)rand);//0
        System.out.println(rand * (max -min + 1));//247.21082188353708
        System.out.println((int)(rand * (max -min + 1)));//247
    }
}
