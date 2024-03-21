//1. Напишите программу для получения списка файлов с расширением .txt из указанной папки
//2. Напишите программу, чтобы получить размер файла в байтах, КБ, МБ
//3.Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log
//4. Написать программу, которая дает пользователю арифметическую задачу со случайными числами и проверяет ответ
package de.telran.lesson20240320practice;
import java.io.*;
public class FileIOExample {
    public static void main(String[] args) {
            String dir = "/Users/andrii.vytiahanets/Downloads/";

            String ext = ".txt";

            findFiles(new File(dir), ext);
        }

// метод поиска
        private static void findFiles(File dir, String ext) {
            if(dir.isDirectory()){
                File file = new File(String.valueOf(dir));
                File[] listFiles = dir.listFiles(new MyFileNameFilter(ext));
                if(listFiles.length == 0){
                    System.out.println(dir + " не содержит файлов с расширением " + ext);
                }else{
                    for(File f : dir.listFiles()){
                        System.out.println("Файл: " + dir + File.separator + f.getName());
                    }
                }
            }
            else{
                System.out.println(dir + " каталог не существует");
            }
        }

// Реализация интерфейса FileNameFilter
        public static class MyFileNameFilter implements FilenameFilter{

            private String ext;

            public MyFileNameFilter(String ext){
                this.ext = ext.toLowerCase();
            }
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(ext);
            }
        }
    }

