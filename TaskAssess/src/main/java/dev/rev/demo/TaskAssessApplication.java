package dev.rev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("dev.rev")
@EnableJpaRepositories("dev.rev.repos")
@EntityScan("dev.rev.beans")
public class TaskAssessApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskAssessApplication.class, args);
	}

}
