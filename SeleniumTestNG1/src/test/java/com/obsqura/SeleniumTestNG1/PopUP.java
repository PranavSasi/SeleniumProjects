package com.obsqura.SeleniumTestNG1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopUP  extends Base{
	
	@Test
	public void popUp() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement faceBook = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		faceBook.click();
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);}}
	}

}
