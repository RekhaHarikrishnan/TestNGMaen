package org.testng;

import org.testng.annotations.Test;

public class GroupingMethod {
	@Test(groups =" colour")
	private void red() {
		System.out.println("Red");

	}
	
	@Test(groups =" colour")
	private void green() {
		System.out.println("Green");

	}
	@Test
	private void books() {
		System.out.println("Books");

	}

	@Test
	private void notes() {
		System.out.println("Notes");

	}
}
