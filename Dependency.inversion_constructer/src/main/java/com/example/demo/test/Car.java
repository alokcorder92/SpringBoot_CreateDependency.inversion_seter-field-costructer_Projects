package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component
public class Car {
	  Engine engine;
	  
	  
	  public Car(Engine engine) {
		super();
		this.engine = engine;
	}


     public void show() {
		    engine.start();
	  }

}
