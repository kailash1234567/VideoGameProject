package org.testing.utilities;

import java.util.Random;

public class randomdata {
	public static String randomvalue(){
		
		Random  r = new Random();
		 Integer i =     r.nextInt();
		 return i.toString();
		
	}

}
