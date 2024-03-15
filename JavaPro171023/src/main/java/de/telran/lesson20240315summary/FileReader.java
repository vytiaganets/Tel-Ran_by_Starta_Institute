package de.telran.lesson20240315summary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader implements Reader {
    @Override
    public String readText(String source) throws IOException {
        return new String(new FileInputStream(source).readAllBytes());
    }
}