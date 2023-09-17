package com.obsqura.SeleniumTestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Base {
WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KuAp\\git\\SeleniumProjects\\SeleniumTestNG1\\src\\main\\java\\Resources\\chromedriver.exe" );
		driver=new ChromeDriver();
		//driver = WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void driverCloseOrQuit(){
		//driver.close();
		driver.quit();
	}

}
