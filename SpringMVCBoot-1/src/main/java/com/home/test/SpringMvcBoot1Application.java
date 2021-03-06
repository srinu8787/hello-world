package com.home.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories("com.home.dao")
@EntityScan("com.home.bean")
public class SpringMvcBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcBoot1Application.class, args);
	}

}
