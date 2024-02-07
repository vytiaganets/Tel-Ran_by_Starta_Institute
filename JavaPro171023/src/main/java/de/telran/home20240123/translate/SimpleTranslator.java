package de.telran.home20240123.translate;

import java.io.StringReader;

public class SimpleTranslator {
    public static void main(String[] args) {
        EnglishUkrainian translator1 = new EnglishUkrainian("Bob Marley", 40, "M");
        translator1.canTranslate();
        //Перевод: Bob Marley, возраст: 40, пол M
        //Bob Marley может переводить с английского на украинский язык.
        GemanUkrainian translator2 = new GemanUkrainian("Olaf Scholz", 29, "M");
        translator2.canTranslate();
        //Перевод: Olaf Scholz, возраст: 29, пол M
        //Olaf Scholz может переводить с немецкого на украинский язык.
    }

}
