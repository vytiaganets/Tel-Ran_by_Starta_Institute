public class While {
    public static void main(String[] args) {
//        int i = 10;
//        int sum = 0;
//        while (i >= 10) {
//            if (i % 2 == 0) {
//                System.out.println(i);//10
//            }
//            i--;
//        }
//        System.out.println(sum);//0

                int i = 10;
                int sum = 0;
                while (i >=0){
                    if (i %2 ==0){
                        sum += i; //сумма четных чисел
                        System.out.println(i);
                    }
                    i--;
                }
                System.out.println(sum);
//        10
//        8
//        6
//        4
//        2
//        0
//        30
            }
        }