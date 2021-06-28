package lss.spring.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw7Application.class, args);
		// После запуска заходим по ссылке
		// http://localhost:8189/dbuniver/index.html
		// база развернётся на H2
	}

}
