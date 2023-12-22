package main.java.org.example.others;

public class Main {
    public static void main(String[] args) {
        String[] engWords = {"Hi", "Hello", "World"};
        String[] rusWords = {"Хай", "Привет", "Мир"};
        for (int i = 0; i < engWords.length; i++) {
            String word = engWords[i];
            String rusWord = rusWords[i];
            System.out.println(word + " = " + rusWord);
        }
        String str = "Hello World Hi World";
        String[] masStr = str.split(" ");
        for (String str1 : masStr) {
            for(int i = 0; i < engWords.length; i++){
            if (str1.equals(engWords)) {
                String rusWorld = rusWords[i];
                System.out.println(rusWorld + " ");
            }
        }
        }
    }
}
