package com.ayush.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component -> Hey spring now you are responsible for creating object and managing them
@Component
public class Alien {
//	@Autowired -> Hey Spring do you have any object of this class 
	@Autowired
	Laptop lap;
	
	public Alien() {
		System.out.println("Alien constructor");
	}
	
	public void code() {
		System.out.println("Alien is coding");
		lap.compile();
		System.out.println("Code compiled Sucessfully");
	}
}
