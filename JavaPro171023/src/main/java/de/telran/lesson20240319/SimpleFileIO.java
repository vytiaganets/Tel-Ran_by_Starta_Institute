package de.telran.lesson20240319;

import java.io.*;

public class SimpleFileIO {
    public static void main(String[] args) throws IOException {
        File testFile = new File("testFile.txt");
        if (!testFile.exists()) {
            try {
                if (testFile.createNewFile()) {
                    // запись в файл
                    FileOutputStream streamOut = null;
                    streamOut = new FileOutputStream(testFile);
                    //создаем строку в виде байтового массива
                    String outStr = "This is my first experience when I myself work with IO API. \nI can do everything!";
                    //byte[] output = "This is my first experience when I myself work with IO API. \nI can do everything!".getBytes();
                    byte[] output = outStr.getBytes();
                    streamOut.write(output);
                    streamOut.close();//чтение из файла
                }

                //чтение из файла reader
                FileInputStream streamIn = null;
                try {
                    streamIn = new FileInputStream(testFile);
                } catch (
                        FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                Reader reader = new InputStreamReader(streamIn);
                StringBuilder inStr = new StringBuilder();
                int data = reader.read();//вычитывание символа в формате Юникода
                while (data != -1) {//пока не конец файла
                    inStr.append((char) data);
                    System.out.print((char) data);
                    data = reader.read();
                }
                reader.close();
                streamIn.close();
                System.out.println();
                System.out.println("Input from file: " + inStr);

                inStr.delete(0, inStr.length()); // чищу получатель
                //чтение из файла по байтам
                InputStream streamInI = new FileInputStream(testFile);
                data = streamInI.read();
                while (data != -1) {
                    inStr.append((char) data);
                    System.out.print((char) data);
                    data = streamInI.read();
                }

                streamInI.close();
                System.out.println("Получаю через InputStream " + inStr);


                //чтение файла с помощью буфера построчно
                InputStream streamInBuf = new FileInputStream(testFile);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamInBuf));
                String strIn = bufferedReader.readLine();
                while (strIn != null) {
                    System.out.println(strIn);
                    strIn = bufferedReader.readLine();

                }
                bufferedReader.close();
                streamInBuf.close();
            } catch (
                    FileNotFoundException |
                    NullPointerException e) {
                System.out.println("Произошло исключение");
            } catch (
                    IOException e) {
                System.out.println("Произошло исключение"
                        + e.getLocalizedMessage());
            } catch (
                    Exception e) {
                System.out.println("Произошло исключение" + e.getLocalizedMessage());
            }
        finally{
                    System.out.println("Логика, которая отрабатывает всегда!!!");
                }
        }
    }
}
///Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50126:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/andrii.vytiahanets/Documents/Tel-Ran_by_Starta_Institute/JavaPro171023/target/classes de.telran.lesson20240319.SimpleFileIO
//This is my first experience when I myself work with IO API.
//I can do everything!
//Input from file: This is my first experience when I myself work with IO API.
//I can do everything!
//This is my first experience when I myself work with IO API.
//I can do everything!Получаю через InputStream This is my first experience when I myself work with IO API.
//I can do everything!
//This is my first experience when I myself work with IO API.
//I can do everything!
//Логика, которая отрабатывает всегда!!!
//
//Process finished with exit code 0