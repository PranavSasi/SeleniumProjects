package com.obsqura.SeleniumTestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class LocatorAnalysisTestSpeed extends Base {
	@Test
	public void locateByID() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
	}
	@Test
	public void locateByClass() {
		WebElement showMessageButton = driver.findElement(By.className("btn btn-primary"));
	}
	@Test
	public void locateByCSSSelector() {
		WebElement showMessageButton = driver.findElement(By.cssSelector("button#button-one"));
	}
	@Test
	public void locateByXpath() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	}
}
