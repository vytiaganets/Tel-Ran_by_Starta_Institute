public class StringBufferTest {
    public static void main(String[] args) {
//        StringBuilder sbld = new StringBuilder("123");
//        StringBuffer sbf = new StringBuffer("123");
//        String str = new String("123");
//        System.out.println(sbld.equals(sbf));//false
        //String s = (String)sbf; //error
        StringBuffer sBuff = new StringBuffer("It is String Builder Object");
        System.out.println(sBuff.capacity());
        System.out.println(sBuff.length());
        System.out.println(sBuff);
        System.out.println(sBuff.toString());
        sBuff.replace(13, 20, "Buffer");
        System.out.println(sBuff);
    }
}