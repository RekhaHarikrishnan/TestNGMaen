package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicStcmMethod {
	@BeforeSuite
	private void setProperty() {
		System.out.println("Property Setting");

	}
	@BeforeTest
	private void browserLaunch() {
	System.out.println("Chrome");
	}
	@BeforeClass
	private void url() {
		System.out.println("Facebook.com");
		
	}
	@BeforeMethod
	private void logIn() {
		System.out.println("Login");		

	}
	@Test
	private void searchLaptop1() {
		System.out.println("Search Laptop");

	}
	@Test
	private void searchPhone1() {
		System.out.println("Serach Phone");

	}
	@AfterMethod
	private void logOut() {
		System.out.println("Log out");

	}
	@AfterClass
	private void closeBrowser() {
		System.out.println("Close the Browser");

	}
	@AfterTest
	private void verification() {
		System.out.println("Verification");

	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");

	}

}
