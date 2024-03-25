package de.telran.lesson20240322summary;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/main/java/de/telran/lesson20240322summary/task.csv"));
        String line;
        int sum=0;
        int count=0;
        while(true){
            line=bufferedReader.readLine();
            if(line==null) break;
            System.out.println(line);
            count=count+1;
            if(count>1){
                sum=sum+Integer.parseInt(line.split(", ")[2]);
            }
        }
        System.out.println(sum);
    }
}
