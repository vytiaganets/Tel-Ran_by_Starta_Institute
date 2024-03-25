package de.telran.lesson20240325practice;

import java.io.Serializable;

public class Author implements Serializable {
    private String name;
    private String additionalInfo;

    public Author(String name, String additionalInfo) {
        this.name = name;
        this.additionalInfo = additionalInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Author author = (Author) o;

        if (!name.equals(author.name))
            return false;
        return additionalInfo.equals(author.additionalInfo);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
