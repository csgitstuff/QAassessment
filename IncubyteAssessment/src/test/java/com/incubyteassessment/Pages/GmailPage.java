package com.incubyteassessment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GmailPage extends GooglePage{

	public WebElement clickOnCompose() {
		return driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
	}
}
