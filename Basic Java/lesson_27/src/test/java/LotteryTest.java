//============createWinData===========
//1. тестируем длину массива на совпадение с константами +
// добавить assertFalse и 2 теста на проверку длины. -

//===========countWinNum============
//1. проверить входные данные массивов, что передаем правильно +
//2. проверка возвращаемого результата +
// добавить assertNotEquals -


import org.example.Util;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LotteryTest {
    @Test
    public void inputDataTest() {
        Integer[] arr = Util.createWinData();
        for (int i = 0; i < arr.length; i++) {
            assertTrue(arr[i] > 0 && arr[i] < 51 );
        }
    }
    @Test
    public void countWinNumTest() {
        Integer[] arr1 = {1, 2, 3, 4, 21};
        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(4, Util.countWinNum(arr1, arr2));

    }
}