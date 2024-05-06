package de.telran.lesson20240502;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Lesson20240502Application {

	public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 10 ; i++)
            System.out .println(faker.name().fullName()) ;

		SpringApplication.run(Lesson20240502Application.class, args);
        //Shanon Dach
        //Ms. Crissy Marvin
        //Machelle Labadie
        //Miss Portia Herman
        //Christina Parker
        //Melissia Kilback DVM
        //Burl Abbott V
        //Danita Pollich
        //Brenton Konopelski Sr.
        //Benton Littel
	}

}
