package de.telran.home20240125.utility;

public class Utility {
    public Utility() {
    }
    public static int getAvg(int num1, int num2){
        return (num1+num2)/2;
    }
    public static double getAvg(double num1, double num2){
        return (num1+num2)/2;
    }
    public static int getMax(int num1, int num2){
        int max = num1;
        if(num1 >= num2) {
            max = num1;
        }
        if(num1 < num2) {
            max = num2;
        }
        return max;
    }
    public static double getMax(double num1, double num2){
        double max = num1;
        if(num1 >= num2) {
            max = num1;
        }
        if(num1 < num2) {
            max = num2;
        }
        return max;
    }
    public static double getMax(int num1, double num2){
        double max = num1;
        if(num1 >= num2) {
            max = num1;
        }
        if(num1 < num2) {
            max = num2;
        }
        return max;
    }
    public static int getMin(int num1, int num2){
        int min = num1;
        if(num1 <= num2) {
            min = num1;
        }
        if(num1 > num2) {
            min = num2;
        }
        return min;
    }
    public static double getMin(double num1, double num2){
        double min = num1;
        if(num1 <= num2) {
            min = num1;
        }
        if(num1 > num2) {
            min = num2;
        }
        return min;
    }
    public static double getMin(int num1, double num2){
        double min = num1;
        if(num1 <= num2) {
            min = num1;
        }
        if(num1 > num2) {
            min = num2;
        }
        return min;
    }
    public static int getAvg(int[] nums){
        int avgs = 0;
        for(int i=0; i<nums.length;i++){
            avgs = avgs + nums[i];
        }
        return avgs = avgs/ nums.length;
    }
    public static double getAvg(double[] nums){
        double avgs = 0;
        for(int i=0; i<nums.length;i++){
            avgs = avgs + nums[i];
        }
        return avgs/ nums.length;
    }
}
