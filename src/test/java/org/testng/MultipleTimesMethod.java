package org.testng;

import org.testng.annotations.Test;

public class MultipleTimesMethod {
	
	//scenario:How to run a method multiple times?=invocation count=some number
    // method run according to alphabetical order
	
	
	@Test(invocationCount = 6)
	private void serachLaptop() {
	System.out.println("Laptop");

	}
	
	@Test
	private void searchApplePhone() {
		System.out.println("Iphones");
	}
}
