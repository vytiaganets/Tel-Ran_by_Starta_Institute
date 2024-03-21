package de.telran.lesson20240321;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class SimpleNio {
    public static void main(String[] args) throws IOException {
        Path pathDefault = Paths.get( "testFile.txt");
        Path pathAbsolut = Paths.get( "/Users/andrii.vytiahanets/Documents/Tel-Ran_by_Starta_Institute/JavaPro171023/src/main/java/de/telran/lesson20240321/testFile.txt");
        Path path = Paths.get( "./src/main/java/de/telran/lesson20240321/testFile.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(pathDefault.toAbsolutePath());
        System.out.println(path.getNameCount());//сколько элементов в пути 8
        System.out.println(path.getName(0));//.
        System.out.println(path.getName(path.getNameCount()-1));//testFile.txt
        System.out.println(path.getParent());//./src/main/java/de/telran/lesson20240321

        //существование файла
        //file existence
        System.out.println("testFile.txt"+Files.exists(pathDefault));//true - default catalog
        System.out.println("testResourceFile.txt"+Files.exists(path));//true
        if (Files.notExists(path)){
            Path file = Files.createFile(path);//file create
            System.out.println("testResourceFile.txt"+Files.exists(path));
        }
        //это папка? есть  аналогичные для других обьектов
        System.out.println(Files.isDirectory(path));//false
        System.out.println(Files.isDirectory(pathAbsolut));//false
//исследуем -  свойства файла или папки элемента
        System.out.println("'Метаданные - свойства элемента");
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.getOwner(path));

        System.out.println("Один и тот же файл? -> "+Files.isSameFile(path, pathDefault));

        //копировать
        //pathAbsolut = Files.copy(pathDefault, pathAbsolut, StandardCopyOption.REPLACE_EXISTING);//exception
        path = Files.copy(pathDefault, pathAbsolut, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);

        //Delete
        //System.out.println("Delete: "+Files.deleteIfExists(path));//Delete: true
        //System.out.println("Delete: "+Files.deleteIfExists(pathAbsolut));//удалять можем только пустой каталог - Delete: true

        //Перенос
        Path newPath = Files.move(path, Paths.get("./src/main/java/de/telran/lesson20240321/" +path.getName(path.getNameCount()-1)), StandardCopyOption.REPLACE_EXISTING);

        //Delete
        //StandardCopyOption. REPLACE_EXISTING заменяет существующий файл, если он существует.
        //StandardCopy0ption. ATOMIC_MOVE попытка осуществить перемещение файла как единую атомарную операцию.
        System.out.println("Delete: "+Files.deleteIfExists(path));//Delete: true

//        StandardCopyOption.REPLACE_EXISTING заменять существующие файлы.
//        StandardCopyOption.COPY_ATTRIBUTES| копирует атрибуты файла.
//        LinkOption. NOFOLLOW_LINKS не переходить по символическим ссылкам.

//        int nameCount = path.getNameCount();//сколько вложений
//        System.out.println(nameCount);
//        System.out.println (path.toAbsolutePath());
//        Path path1 = Paths.get(path.toAbsolutePath().toString());
//        nameCount = path.getNameCount();
//        System.out.println(nameCount);
    }
}
