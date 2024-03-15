package de.telran.lesson20240315summary;

import java.util.Map;

public class InMemoryReader implements Reader {
    private final Map<String, String> sourceToText;

    public InMemoryReader(Map<String, String> sourceToText) {
        this.sourceToText = sourceToText;
    }

    @Override
    public String readText(String source) {
        return sourceToText.get(source);
    }
}
