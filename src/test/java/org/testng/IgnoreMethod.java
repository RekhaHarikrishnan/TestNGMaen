package org.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreMethod {
	
	@Ignore
	@Test
	private void redColor() {
		System.out.println("Red");
	}
	
	@Test(enabled = false)
	private void greenColor() {
		System.out.println("Green");
	}
	
	@Test
	private void pinkColor() {
		System.out.println("Pink");
	}

}
