package com.lhy.springdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Springdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo2Application.class, args);
	}
}
