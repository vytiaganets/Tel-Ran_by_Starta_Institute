//*Написать приложение, которое будет копировать содержимое одной папки в другую со всеми вложениями
//(другие папки, файлы).
//*Write an application that will copy the contents of one folder to another with all attachments
//(other folders, files).
//The path to the existing folder and the name of the new folder must be entered from the keyboard.
package de.telran.home20240319;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class SimpleDirectory {
    public static void main(String[] args) {
        copyDirectory();
        //Введите путь к существующей папке
        //src/main/java/de/telran/home20240319/olddir
        //Введите название новой директории
        //src/main/java/de/telran/home20240319/newdir

        //newdir
        //   test.txt
        //olddir
        //   test.txt
    }

    private static void copyDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к существующей папке");
        String dirPath = scanner.nextLine();//src/main/java/de/telran/home20240319/olddir
        File dir = new File(dirPath);

        System.out.println("Введите название новой директории");
        String newDirName = scanner.nextLine();//src/main/java/de/telran/home20240319/newdir
        File dirSource = new File(dirPath);
        File dirDestination = new File(newDirName);
        try {
            copyContent(dirSource, dirDestination);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyContent(File srcDir, File destDir) throws IOException {
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        File[] files = srcDir.listFiles();
        if (files != null) {
            for (File file : files) {
                File destFile = new File(destDir, file.getName());
                if (file.isDirectory()) {
                    copyContent(file, destFile);
                } else {
                    Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }
}
