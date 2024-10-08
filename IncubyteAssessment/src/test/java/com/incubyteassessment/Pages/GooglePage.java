package com.incubyteassessment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.incubyteassessment.utilities.BaseTest;

public class GooglePage extends BaseTest {

	public WebElement googleAppIcon() throws InterruptedException {

		WebElement signIn = driver.findElement(By.xpath("//*[@class='LX3sZb']//span[text()='Sign in']"));
           
		if (signIn.getText().contains("Sign in")) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", signIn);
			
			driver.findElement(By.xpath("//input[@autocomplete='username webauthn']")).sendKeys("1993somnathshinde@gmail.com");
			driver.findElement(By.xpath("//div[@class='JYXaTc']//span[text()='Next']")).click();
			
		} else {
			getGoogleApp().click();
			getGoogleIconApp().click();
		}
		return signIn;
	}

	public WebElement getGoogleApp() {
		return driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
	}

	public WebElement getGoogleIconApp() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='app']")));
		return driver.findElement(By.xpath("//div[@class='o83JEf']//*[text()='Gmail']"));
	}

}
