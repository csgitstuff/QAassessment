package com.incubyteassessment.testcases;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.incubyteassessment.Pages.ComposePage;
import com.incubyteassessment.utilities.BaseTest;
import com.incubyteassessment.utilities.Logs;

public class ComposePageTest extends ComposePage {

	@BeforeMethod
	public static void Initialization() {
		BaseTest browserLaunch = new BaseTest();
		browserLaunch.launchBrowser();
		Logs.info("browser launched");
	}

	@Test(description = "Compose and send an email with all required fields",enabled = false)
	public void TC1() throws InterruptedException {
		
		ComposePage composePage = new ComposePage();
		composePage.googleAppIcon().click();
		Logs.info("Clicked on google apps icon");

		composePage.clickOnCompose().click();
		Logs.info("Clicked on compose");
		
		composePage.getNewMessage();
		composePage.ToTxt().sendKeys("tanuja.aroor@zelevate.io");
		composePage.subjectTxt().sendKeys("Incubyte");
		composePage.bodyTxt().sendKeys("QA Test for Incubyte");
		composePage.sendBtn().click();
		Logs.info("Entered required details");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String actualMsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Message sent']")))).getText();
	
		String expectedMsg = "Message sent";	
		
		Assert.assertEquals(expectedMsg, actualMsg, "Message has been sent successfuly");
	
	}
	
	@Test(description = "Save a draft email", enabled = false)
	public void TC2() throws InterruptedException {
		ComposePage composePage = new ComposePage();
		composePage.googleAppIcon().click();
		Logs.info("Clicked on google apps icon");
		
		composePage.clickOnCompose().click();
		Logs.info("Clicked on compose");
		
		composePage.getNewMessage();
		composePage.ToTxt().sendKeys("tanuja.aroor@zelevate.io");
		composePage.subjectTxt().sendKeys("Incubyte");
		composePage.bodyTxt().sendKeys("QA Test for Incubyte");
		Logs.info("Entered required details");
		
		composePage.saveAndCloseBtn().click();
		Logs.info("Message save and closed");
	}
	
	@Test(description = "Compose with an invalid emailID",enabled = false)
	public void TC3() throws InterruptedException {
		
		ComposePage composePage = new ComposePage();
		composePage.googleAppIcon().click();
		Logs.info("Clicked on google apps icon");
		
		composePage.clickOnCompose().click();
		Logs.info("Clicked on compose");
		
		composePage.getNewMessage();
		composePage.ToTxt().sendKeys("tanuja.aroor@zelevate.io");
		composePage.subjectTxt().sendKeys("Incubyte");
		composePage.bodyTxt().sendKeys("QA Test for Incubyte");
		composePage.sendBtn().click();
		Logs.info("Entered required details");

	}
	
	@Test(description = "Compose without a recipient")
	public void TC4() {
		Logs.info("Test case 4");
	}
	
	@Test(description = "Compose without a body")
	public void TC5() {
		Logs.info("Test case 5");
	}

	//@AfterMethod
	public static void teardown() {
		BaseTest browserclose = new BaseTest();
		browserclose.closeBrowser();
	}

	
}
