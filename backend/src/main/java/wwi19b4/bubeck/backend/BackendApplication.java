package wwi19b4.bubeck.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Hauptklasse für die Lauffähigkeit des Services
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		System.out.println("Starting...");
		SpringApplication.run(BackendApplication.class, args);
	}
}
