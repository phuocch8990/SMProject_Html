package poly.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("poly.edu")
public class SmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmProjectApplication.class, args);
	}
}
