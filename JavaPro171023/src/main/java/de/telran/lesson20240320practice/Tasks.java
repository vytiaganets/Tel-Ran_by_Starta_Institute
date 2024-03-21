package de.telran.lesson20240320practice;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Date;
public class Tasks {
    public static void main(String[] args) {
        // 1. Напишите программу для получения списка файлов с расширением .txt из указанной папки
        File folder = new File ( "/Users/andrii.vytiahanets/Downloads/");
        System.out.println(folder.exists());
        System.out.println(folder.isDirectory());
        File[] files = folder.listFiles();
        Stream.of(files).filter (file -> file.getName ().endsWith(".txt")).forEach(System.out::println);

        FilenameFilter filenameFilter = (dir, name) -> name.endsWith(".txt");
        File[] txtFiles = folder.listFiles(filenameFilter);
        System.out.println(Arrays.toString(txtFiles));
//true
//true
///Users/andrii.vytiahanets/Downloads/G.A.S.T DTZ B1, HÃ¶ren 1-4, PrÃ¼fung B1 Neu 2024.txt
///Users/andrii.vytiahanets/Downloads/HS_B1_Track_002.txt
//[/Users/andrii.vytiahanets/Downloads/G.A.S.T DTZ B1, HÃ¶ren 1-4, PrÃ¼fung B1 Neu 2024.txt, /Users/andrii.vytiahanets/Downloads/HS_B1_Track_002.txt]
        // 2. Напишите программу, чтобы получить размер файла в байтах, КБ, МБ
        File file = new File("/Users/andrii.vytiahanets/Downloads/HS_B1_Track_002.txt");
        long length = folder.length();
        System.out.println(length+"bytes");
        System.out.println((double) length / 1024 + "kB");
        System.out.println((double) length / 1024 /1024 + "MB");
        //2080bytes
        //2.03125kB
        //0.001983642578125MB

        // 3. Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            File logFile = new File("/Users/andrii.vytiahanets/Downloads/errors.log");
            //File logFile = new File("./resources/errors.log");
            try(
                    FileWriter writer = new FileWriter(logFile,true);//data at the end
                    PrintWriter printWriter = new PrintWriter(writer);
                    ){
                Date date = new Date();
                printWriter.println(date);
                e.printStackTrace(printWriter);
            } catch (
                    IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        //Wed Mar 20 14:39:53 CET 2024
        //java.lang.ArithmeticException: / by zero
        //	at de.telran.lesson20240320practice.Tasks.main(Tasks.java:36)
        // 4. Написать программу, котордя дает пользователю арифметическую задачу со случайными числами и проверяет ответ
    }
}
