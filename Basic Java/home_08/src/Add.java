//Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N . Найдите недостающий элемент.
//Пример 1:
//Вход:
// N = 5
//А[] = {1,2,3,5}
//Выход: 4
//
//Пример 2:
//Вход:
//N = 10
//А[] = {6,1,2,8,3,4,7,10,5}
//Выход: 9
public class Add {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 5};
        int[] arr2 = new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5};
        int res1 = missingElement(arr1);
        int res2 = missingElement(arr2);
        System.out.println("А[] = {1,2,3,5} -> " + res1);
        System.out.println("А[] = {6,1,2,8,3,4,7,10,5} -> " + res2);
//        А[] = {1,2,3,5} -> 4
//        А[] = {6,1,2,8,3,4,7,10,5} -> 9
    }
    static public int missingElement(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int num : nums) {
            sum1 += num;
        }
//        for (int i = 0; i <= nums.length-1; i++) {
//            sum1 += nums[i];
//        }
        for (int i = 0; i <= nums.length+1; i++) {
            sum2 += i;
        }
        return sum2 - sum1;
    }
}
