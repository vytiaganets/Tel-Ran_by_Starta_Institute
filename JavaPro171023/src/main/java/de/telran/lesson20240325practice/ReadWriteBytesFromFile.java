//Write 3 bits '101' to a file and read them.
//1. Записать 3 бита '101' в файл, считать их.
package de.telran.lesson20240325practice;

import java.io.*;

public class ReadWriteBytesFromFile {
    public static void main(String[] args) {
        File file = new File("src/main/java/de/telran/lesson20240325practice/binary");
        //int data;
        byte data = 0b101;
        data = 5;
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
        )  {
            fileOutputStream.write(data);
            fileOutputStream.write(0b101);
    } catch (IOException e) {
            e.printStackTrace();
}

        try (
                FileInputStream fileInputStream = new FileInputStream(file);
        ) {
            int result = 0;
            while (result != -1){
                    result = fileInputStream.read();
            System.out.println(result);
        }
//            int result = fileInputStream.read();
//            System.out.println(result);//5
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
