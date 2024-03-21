package de.telran.lesson20240321;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.StandardOpenOption;

public class SimpleFileNio {
    public static void main(String[] args) throws IOException {
        //canals каналы

        //чтение
        Path pathFile = Paths.get("testFile.txt");
        byte[] buffer = new byte[1000];
        List<String> stringList = new ArrayList<>();
        if (Files.exists(pathFile)) {
            try (BufferedReader reader = Files.newBufferedReader(pathFile, StandardCharsets.UTF_8);
                 ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {//for test ByteArrayInputStream
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    stringList.add(line);
                }
            } catch (
                    IOException e) {
                throw new RuntimeException();
            }
        }
        //сохранение
        Path logFile = Paths.get("testCopyFile txt");
        if (Files.notExists(logFile)) {
            logFile = Files.createFile(logFile);
        }
        try (BufferedWriter writer = Files.newBufferedWriter(logFile, StandardCharsets.UTF_8,
                StandardOpenOption.WRITE)) {
            stringList.stream().forEach(s -> {
                try {
                    writer.write(s);
                } catch (
                        IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (
                IOException e) {
            throw new RuntimeException();
        }

    }
}

