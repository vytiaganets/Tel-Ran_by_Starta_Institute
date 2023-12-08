import java.util.Scanner;

public class Strings {
    //    Описание задания.
//            1 уровень сложности: №1
//    Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//    Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//            Например:
//    ввод - mama, papa
//    вывод - mapa
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String str1 = sc.next();//papa
        System.out.println("Введите второе слово: ");
        String str2 = sc.next();//mama
        if (str1.length() % 2 != 0) {
            System.out.println("Введите повторно первое слово из четного количества букв: ");
            str1 = sc.next();
        }
        if (str2.length() % 2 != 0) {
            System.out.println("Введите повторно второе слово из четного количества букв: ");
            str2 = sc.next();
        }
        //str1.length() % 2 == 0 && str2.length() % 2 == 0
            String str3 = (str1.substring(0, str1.length() / 2)) +
                    (str2.substring(str2.length() / 2, str2.length()));
            System.out.println(str3);//pama
    }
//2
// public static void concatTwoHalvesOfWord(String wordOne, String wordTwo) {
// if (checkWordLength (wordOne)){
// return; 
// }
// if (checkWordLength(wordTwo)) {
//     return;
// }
// System.out.printin(wordOne.substring(e, wordOne. Length() / 2)
// + wordTwo. substring( beginindex: wordTwo. Length() / 2));

// private static boolean checklordLength(String word) {
// if (word. Length() % 2 != 0) {
// System.out .printlA("The word is wrong length, read the rules!");
// return true;
// }
// return false;
// }
}