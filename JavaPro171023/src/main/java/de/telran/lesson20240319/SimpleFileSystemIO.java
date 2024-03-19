package de.telran.lesson20240319;

import java.io.File;
import java.io.IOException;

public class SimpleFileSystemIO {
    public static void main(String[] args) throws IOException {
//        File file = new File("file.txt");
//        boolean isExists = file.exists();//проверка существования
//        System.out.println("file exists " + isExists);
//
//        boolean wasCreatedFile = file.createNewFile();
//        System.out.println("created file " +wasCreatedFile);
//Created
//        File filePath = new File ("/Users/andrii.vytiahanets/Downloads/file.txt");
//        wasCreatedFile = filePath.createNewFile();
//        System.out.println("created file " + wasCreatedFile);
//Size
//        long length = file.length();
//        System.out.println("size file " + length);
//        //delete
//        boolean success = file.delete();
//        System.out.println("delete file "+success);
        File dir = new File("new_dir");

        boolean wasCreated = dir.mkdir(); //создание папки
        System.out.println("created dir " + wasCreated);
//создание вложенного файла или директория
        File file1 = new File(dir, "file.txt");
        if (!file1.exists()) {
            System.out.println("created file " + file1.createNewFile());
        }

        System.out.println("created dir " + wasCreated);
        //delete catalog
        boolean success = dir.delete();//empty catalog only
        System.out.println(success);

        success = deleteDir(dir);
        System.out.println("delete dir - " + success);

        success = deleteDir(dir);
        System.out.println("delete dir included " + success);
    }

    public static boolean deleteDir(File dir) {
        File[] files = dir.listFiles();//возвращаем дочерние объекты
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {//it's  folders
                    deleteDir(file);
                } else {
                    file.delete();//delete file
                }
            }
        }
        return dir.delete();
    }
}
