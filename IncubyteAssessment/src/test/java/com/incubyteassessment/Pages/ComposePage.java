package com.incubyteassessment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComposePage extends GmailPage{


	public WebElement ToTxt() {
		return driver.findElement(By.xpath("//input[@class='agP aFw']"));
	}
	
	public WebElement subjectTxt() {
		return driver.findElement(By.xpath("//input[@placeholder='Subject']"));
	}
	
	public WebElement bodyTxt() {
		return driver.findElement(By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']"));
	}
	
	public WebElement sendBtn() {
		return driver.findElement(By.xpath("//td[@class='gU Up']//div[text()='Send']"));
	}
	
	public WebElement saveAndCloseBtn() {
		return driver.findElement(By.xpath("//img[@alt='Close']"));
	}

	
	public void getNewMessage() {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/mail/_/bscframe']")));
	}

}
