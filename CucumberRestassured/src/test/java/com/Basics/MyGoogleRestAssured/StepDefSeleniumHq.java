package com.Basics.MyGoogleRestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefSeleniumHq {
	WebDriver driver;
	@Given("I am on SeleniumHq webAapp")
	public void i_am_on_SeleniumHq_webAapp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\All Software\\chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
        driver.navigate().to("https://selenium.dev/"); 
        Thread.sleep(2000);
	    
	}

	@When("Click on Download link")
	public void Click_on_Download_link() throws InterruptedException {
		driver.findElement(By.xpath("//nav/a[contains(text(),'Downloads')]")).click();
		Thread.sleep(2000);
	   // throw new PendingException();
	}

	@Then("^Download page is open$")
	public void download_page_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
