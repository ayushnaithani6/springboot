package com.ayush.first;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	public Laptop() {
		System.out.println("Laptop Constructor");
	}
	
	public void compile() {
		System.out.println("Code is compiling");
	}
}
