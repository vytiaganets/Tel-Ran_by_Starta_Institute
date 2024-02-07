package de.telran.algorithms20240207;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,10};
        int res  = getIndex(arr, 1);//
        System.out.println("2 - " + res + " index ");//2 - -1 index    11
                                                    //2 - 0 index      1
    }
    public static int getIndex(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
//START

//READ array arr[], key k

//FOR i = 0 to array.length - 1 do

//IF arr[i] = k THEN

//      return i

//return -1;

//END

//public class Main {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, 5, 10};
//
//        int res = getIndex(arr, 11);
//
//        System.out.println("2 - " + res + " index" );
//
//
//
//    }
//
//
//
//    public static int getIndex(int[] arr, int num) {
//
//        for(int i = 0; i < arr.length; i++) {
//
//            if (arr[i] == num) {
//
//                return i;
//
//            }
//
//        }
//
//        return -1;
//
//    }
//
//}
//
//JAVASCRIPT:
//        function linerSearch() {
//
//        let arr = [1, 2, 3, 5, 10];
//
//        console.log('2 - ${getNumber(arr, 2)} index');
//
//        }
//
//
//
//        function getNumber(arr, num) {
//
//        for(let i = 0; i < arr.length; i++) {
//
//        if (arr[i] == num) {
//
//        return i;
//
//        }
//
//        }
//
//        return -1;
//
//        }
