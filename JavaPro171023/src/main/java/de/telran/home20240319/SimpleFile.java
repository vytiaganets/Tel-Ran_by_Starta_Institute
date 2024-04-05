//Написать приложение, которое будет копировать информацию из файла в другой файл.
//Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.
//Путь к существующей папке и имя новой папки нужно вводить с клавиатуры.
//Write an application that will copy information from a file to another file.
//The path to the existing file and the name of the new file must be entered from the keyboard.
package de.telran.home20240319;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFile {
    public static void main(String[] args) {
        copyFile();
        //Пожалуйста, введите путь к исходному файлу:src/main/java/de/telran/home20240319/readme.txt
        //Пожалуйста, введите новый путь к файлу:src/main/java/de/telran/home20240319/newreadme.txt
        //Ok
    }

    private static void copyFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите путь к исходному файлу: ");
        String originFile = scanner.next();//src/main/java/de/telran/home20240319/readme.txt
        System.out.print("Пожалуйста, введите новый путь к файлу: ");
        String newFile = scanner.next();//src/main/java/de/telran/home20240319/newreadme.txt
        String text = readFile(originFile);
        writeToFile(text, newFile);
    }

    private static String readFile(String path) {
        StringBuilder text = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            int characters;
            while ((characters = fileReader.read()) != -1) {
                text.append((char) characters);
            }
        } catch (
                Exception e) {
            throw new NullPointerException();
        }
        return text.toString();
    }

    private static void writeToFile(String text, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
            System.out.println("Ok");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
