package org.example;

public class StringJoinService {

    public static void main(String[] args) {
        StringJoinService stringBuilder = new StringJoinService();

        String[] subStr = {"I", "like", "fish"};
        StringBuffer result = stringBuilder.getJoinSubstring(subStr);
        System.out.println(result.toString().trim()); // чтобы получить String нужно вызывать toString
    }

    public StringBuffer getJoinSubstring(String[] subStr) {
        StringBuffer result = new StringBuffer(); // вместо String result = "";
        for(String str: subStr) {
            result.append(str).append(" "); // Idea автоматически преобразовала код
            // result += str + " "; // append в качестве замены конкатенации
        }
        return result;
    }

}

//package org.example;
//
//public class StringJoinService {
//
//    public static void main(String[] args) {
//        StringJoinService stringBuilder = new StringJoinService();
//
//        String[] subStr = {"I", "like", "fish"};
//        StringBuffer result = stringBuilder.getJoinSubstring(subStr);
//        System.out.println(result.toString().trim()); // чтобы получить String нужно вызывать toString
//    }
//
//    public StringBuffer getJoinSubstring(String[] subStr) {
//        StringBuffer result = new StringBuffer(); // вместо String result = "";
//        for(String str: subStr) {
//            result.append(str).append(" "); // Idea автоматически преобразовала код
//            // result += str + " "; // append в качестве замены конкатенации
//        }
//        return result;
//    }
//
//}
