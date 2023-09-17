package com.obsqura.SeleniumTestNG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class FindElementSample extends Base {
	
	@Test
	public void findElementsSample() {
		String input="Radio Buttons Demo"; 
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//a"));

		for(WebElement value: menu) {
			String actualValue = value.getText();
			if(actualValue.equals(input)) {
				value.click();
				break;
			}
		}
	}
	
	@Test
	public void tableTestSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		String input = "Ashton Cox";
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='dtBasicExample']//td"));
		
		for(WebElement name: table) {
			String actualName =name.getText();
			if(actualName.equals(input)) {
				System.out.println("Name exists in the Table");
				break;
			}
			else {
				System.out.println("Name does not exist in the Table");
			}
		}
	}

	@Test
	public void tableTestSample2() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		String input= "Position";
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr//th"));
		
		for(WebElement head: table) {
			String actualHead = head.getText();
			if(actualHead.equals(input)){
			System.out.println("Header exists in the Table");
			break;
			}
			else {
				System.out.println("Header does not exists in the Table");
			}
		}
	}
	
}