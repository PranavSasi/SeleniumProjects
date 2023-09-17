package com.obsqura.SeleniumTestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void testCase1() {
		System.out.println("TestCase1");
	}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("BeforeMethod");
		}
		@AfterMethod
		public void AfterMethod() {
			System.out.println("AfterMethod");
		}
		
		public void testCase2() {
			System.out.println("TestCase2");
		}
			@BeforeClass
			public void beforeClass() {
				System.out.println("BeforeClass");
			}
			@AfterClass
			public void AfterClass() {
				System.out.println("AfterClass");
			}
			
			public void testCase3() {
				System.out.println("TestCase3");
			}
				@BeforeTest
				public void beforeTest() {
					System.out.println("BeforeTest");
				}
				@AfterTest
				public void AfterTest() {
					System.out.println("AfterTest");
				}
				
				public void testCase4() {
					System.out.println("TestCase4");
				}
					@BeforeSuite
					public void beforeSuite() {
						System.out.println("BeforeSuite");
					}
					@AfterSuite
					public void AfterSuite() {
						System.out.println("AfterSuite");
					}
}
