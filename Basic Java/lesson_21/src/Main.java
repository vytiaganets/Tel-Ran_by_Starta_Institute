public class Main {
    public static void main(String[] args) {
//        Object[] o1 = {1, 2, 4};
//        Object[] o2 = o1;

//        Integer[] arrInt = {1,2,4};
        Integer[] arrInt2 = new Integer[10];
//        System.out.println("arrInt has " + arrInt.length);
//        for (int i = 0; i < arrInt.length; i++){
//            System.out.println("Index " + "has " + arrInt[i] + "value");
//        }
//        System.out.println("*******************");
        System.out.println("arrInt2 has " + arrInt2.length);

        for (int i = 0; i < arrInt2.length / 2; i++){
            arrInt2[i] = i + 1;
        }
        for (int i = 0; i < arrInt2.length; i++){
            System.out.println("Index " + i + " has " + arrInt2[i] + " value");
        }
        System.out.println("***************");
        for(int i = 0; i< arrInt2.length; i++){
            if(i % 2 ==0) {
                arrInt2[i] = -1;
            }
        }
        for(int i = 0; i< arrInt2.length; i++){
            System.out.println("Index " + i + " has " + arrInt2[i] + " value");
        }
    }
}
