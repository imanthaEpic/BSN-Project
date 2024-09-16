package com.osh.devhub.booknetwork;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookNetworkApiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		String mysqlDatabase = dotenv.get("MYSQL_DATABASE");
		String mysqlHost = dotenv.get("MYSQL_HOST");
		String mysqlPort = dotenv.get("MYSQL_PORT");
		String mysqlUser = dotenv.get("MYSQL_USER");
		String mysqlPassword = dotenv.get("MYSQL_PASSWORD");
		SpringApplication.run(BookNetworkApiApplication.class, args);
	}

}
