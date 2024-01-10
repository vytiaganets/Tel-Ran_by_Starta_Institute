import org.junit.jupiter.api.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//@SuppressWarnings("UnresolvedClassReferenceRepair")
public class UtilTest {
//
//    @Test
//    publi@BeforeEach
////    public void testBeforePrint(){
////    System.out.println("Hello");}
////    @AfterEach
////    public void testAfterPrint(){
////        System.out.println("Buy");}
////    @BeforeAll
////    public static void testBefore(){
////        System.out.println("Before all");//1 раз
////    }
////    @AfterAll
////    public static void testAfter(){
////        System.out.println("After all");//1 раз
////    }c void getNumbersArrayTest() {
//    }
//    @Test
//    public void getString(){
//
//    }
@Test
    public static void getNumberArraysSuccessTest(){
    //Integer[] arr = Util.getNumber();
    Integer[] arr = {1,2,3};
    //assertEquals(arr, Util.getNumbers());
    assertEquals(Arrays.toString(arr), Arrays.toString(Util.getNumbers()));
}

    @Test
    public static void getNumberArraysNotEqualsSuccessTest(){
        Integer[] arr = {1,2,4};
        assertNotEquals(Arrays.toString(arr), Arrays.toString(Util.getNumbers()));
    }
//@Test
//    public static void getNumberArraysIOExceptionTest(){
//}

}
