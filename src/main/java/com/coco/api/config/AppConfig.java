package com.coco.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.coco.api" })
@EntityScan(basePackages = { "com.coco.api" })
@EnableJpaRepositories("com.coco.api")
public class AppConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppConfig.class, args);
	}

}
