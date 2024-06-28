package com.example.demo.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;
	
	
	
	
	public void show() {
		 engine.start();
	}

}
