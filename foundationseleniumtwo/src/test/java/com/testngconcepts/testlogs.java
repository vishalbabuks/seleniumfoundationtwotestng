package com.testngconcepts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(logimp.class)
public class testlogs {
	
	
	
	@Test
	public void testing() {
		System.out.println("This is a basic test");
		
	}
	@Test
	public void testingtwo() {
		System.out.println("This is a basic test");
		
	}

}
