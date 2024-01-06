package com.nisha.springboot;
//appended to test the update from local terminal (laptop notepadd++)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("SpringBoot Start");
	}

}
