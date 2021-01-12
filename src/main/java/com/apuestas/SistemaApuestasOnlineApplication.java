package com.apuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"controllers","service","repository"})
@EntityScan("entity")
@EnableJpaRepositories("repository")
public class SistemaApuestasOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApuestasOnlineApplication.class, args);
	}

}
