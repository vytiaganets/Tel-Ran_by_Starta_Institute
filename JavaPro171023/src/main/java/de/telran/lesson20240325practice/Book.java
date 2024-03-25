//2. Имеется несколько экземпляров класса Вооk
//public class Book {
//private String title;
//private String author;
//private double price;
//private int bookilount;
//}
//Сохранить их в файл. Считать из файла.
package de.telran.lesson20240325practice;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;


public class Book implements Serializable{
    private String title;
    private Author author;
    private double price;
    private int bookCount;

    public Book(String title, Author author, double price, int bookCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCount = bookCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        if (Double.compare(price, book.price) != 0)
            return false;
        if (bookCount != book.bookCount)
            return false;
        if (!Objects.equals(title, book.title))
            return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + bookCount;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Author rawling = new Author("Rawling","");
        Book book1 = new Book("Harry Poter", rawling, 20, 10);
        Book book2 = new Book("Tom Sawyer", new Author("Mark Twain",""), 15, 40);
        System.out.println(book1);

        //Book{title='Harry Poter', author='Author{name='Rawling', additionalInfo=''}', price=20.0, bookCount=10}
        //[-84, -19, 0, 5, 115, 114, 0, 37, 100, 101, 46, 116, 101, 108, 114, 97, 110, 46, 108, 101, 115, 115, 111, 110, 50, 48, 50, 52, 48, 51, 50, 53, 112, 114, 97, 99, 116, 105, 99, 101, 46, 66, 111, 111, 107, -40, -112, -93, -60, -58, 82, 96, -41, 2, 0, 4, 73, 0, 9, 98, 111, 111, 107, 67, 111, 117, 110, 116, 68, 0, 5, 112, 114, 105, 99, 101, 76, 0, 6, 97, 117, 116, 104, 111, 114, 116, 0, 41, 76, 100, 101, 47, 116, 101, 108, 114, 97, 110, 47, 108, 101, 115, 115, 111, 110, 50, 48, 50, 52, 48, 51, 50, 53, 112, 114, 97, 99, 116, 105, 99, 101, 47, 65, 117, 116, 104, 111, 114, 59, 76, 0, 5, 116, 105, 116, 108, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 120, 112, 0, 0, 0, 10, 64, 52, 0, 0, 0, 0, 0, 0, 115, 114, 0, 39, 100, 101, 46, 116, 101, 108, 114, 97, 110, 46, 108, 101, 115, 115, 111, 110, 50, 48, 50, 52, 48, 51, 50, 53, 112, 114, 97, 99, 116, 105, 99, 101, 46, 65, 117, 116, 104, 111, 114, 101, -70, 33, 15, -120, -11, 47, -59, 2, 0, 2, 76, 0, 14, 97, 100, 100, 105, 116, 105, 111, 110, 97, 108, 73, 110, 102, 111, 113, 0, 126, 0, 2, 76, 0, 4, 110, 97, 109, 101, 113, 0, 126, 0, 2, 120, 112, 116, 0, 0, 116, 0, 7, 82, 97, 119, 108, 105, 110, 103, 116, 0, 11, 72, 97, 114, 114, 121, 32, 80, 111, 116, 101, 114]
        //Book{title='Harry Poter', author='Author{name='Rawling', additionalInfo=''}', price=20.0, bookCount=10}
        //false
        //true
        //Author{name='Rawling', additionalInfo=''}
        //false
        //true

        //serialization
        byte[] byteArray;
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            objectOutputStream.writeObject(book1);
            byteArray = byteArrayOutputStream.toByteArray();
            System.out.println(Arrays.toString(byteArray));
        }
        //deserialization
        try(
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        ){
            Book bookFromBytes = (Book) objectInputStream.readObject();
            System.out.println(bookFromBytes);
            System.out.println(book1==bookFromBytes);
            System.out.println(book1.equals(bookFromBytes));
            Author authorFromBytes =  bookFromBytes.author;
            System.out.println(authorFromBytes);
            System.out.println(rawling == authorFromBytes);
            System.out.println(rawling.equals (authorFromBytes));
        }

    }
}
