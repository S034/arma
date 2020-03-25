package com.e419.arma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.e419.arma.dao")
public class ArmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmaApplication.class, args);
	}

}
