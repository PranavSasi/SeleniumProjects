package com.obsqura.SeleniumTestNG1;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assertion extends Base {
	
	@Test
	public void assertEquals() {
			String input = "ABC";
			String expectedOutput = "Your Message : "+input;
			WebElement singleInputFieldMessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
			singleInputFieldMessage.sendKeys(input);
			WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
			showMessageButton.click();
			WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
			String actualMessage = yourMessage.getText();
			Assert.assertEquals(expectedOutput,actualMessage,"Your message is "+expectedOutput);
	}
	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton =driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected = maleRadioButton.isSelected();
		assertTrue(isMaleRadioButtonSelected,"Male button is not selected");
	}
	@Test
	public void verifyMaleRadioButtonDisabled() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleRadioButton.click();
		WebElement maleRadioButton =driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		boolean maleRadioButtonSelected = maleRadioButton.isSelected();
		assertFalse(maleRadioButtonSelected,"Radio Button is Enabled");
	}
	
	@Test
	public void notEqualsSample() {
		String a = "ABC";
		String b= "CDE";
		Assert.assertNotEquals(a,b,"a and b are same");
	}
	@Test
	public void assertNullSample() {
		String a=null;
		Assert.assertNull(a,"a is not null");
		}
	@Test
	public void hardAssert() {
		String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		String expectedMessage = "Show Message";
		WebElement showMessageButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonBackgroundColor = showMessageButton.getCssValue("background-color"); 
		String actualMessage= showMessageButton.getText();
		Assert.assertEquals(expectedMessage,actualMessage,"The text is not Show Message");
		Assert.assertEquals(expectedBackGroundColor,showMessageButtonBackgroundColor,"The background color is not blue" );
		}	
}
