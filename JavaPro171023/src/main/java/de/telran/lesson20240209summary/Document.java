package de.telran.lesson20240209summary;

public class Document {
    private final String text;
    public Document(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}
