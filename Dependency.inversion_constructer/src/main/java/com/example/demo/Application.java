package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.test.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(Application.class, args);
		 Car car=context.getBean("car",Car.class);
		 car.show();
	}

}
