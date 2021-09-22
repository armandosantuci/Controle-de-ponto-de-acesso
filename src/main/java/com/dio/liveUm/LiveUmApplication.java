package com.dio.liveUm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages={"com.dio"})
@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication

public class LiveUmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveUmApplication.class, args);
	}

}
