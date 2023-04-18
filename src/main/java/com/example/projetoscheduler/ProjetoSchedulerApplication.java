package com.example.projetoscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetoSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSchedulerApplication.class, args);
	}

}
