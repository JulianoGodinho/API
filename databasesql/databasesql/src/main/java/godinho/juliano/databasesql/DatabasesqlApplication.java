package godinho.juliano.databasesql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasesqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(DatabasesqlApplication.class, args);

		System.out.println("Banco h2");
	}

}
