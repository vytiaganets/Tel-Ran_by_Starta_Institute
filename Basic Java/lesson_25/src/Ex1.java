//Создайте объект StringBuilder
//Добавьте в объект строки
//Hello
//“ “ (пробел)
//world!
//Распечатайте результат
//ставьте строку “beautiful “ между слов Hello и world
//Распечатайте результат
//Распечатайте полную емкость (capacity) объекта
//Распечатайте размер объекта
// Проанализируйте результат
//Создайте массив char размера StringBuilder
//Сохраните объект StringBuilder  в массив, используйте метод getChars()
//Распечатайте результат
public class Ex1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world!");
        System.out.println(stringBuilder);

        stringBuilder.replace(5, 6, "beautiful");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());

        char[] characters = new char[stringBuilder.length()];
        stringBuilder.getChars(0, characters.length-1, characters, 0);
        System.out.println(characters);
//        Hello world!
//        Hellobeautifulworld!
//        34
//        20
//        Hellobeautifulworld 
    }
}
