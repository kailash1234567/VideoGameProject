package org.testing.demo;

import org.testng.annotations.Test;

@Test
public class Demo {
public void Demoresult() {
	
	String use = "Yes";
	
	if (use == "Yes") {
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
	}
	else {
		
		System.out.println("No result found in this plate form.....");
	}
}
}
