package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStep {
	
	WebDriver driver;
	
	
	@Given("User navigates to login page {string}")
	public void user_navigates_to_login_page(String url) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		
		
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
	  WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
	  usernameField.sendKeys(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		  WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		  passwordField.sendKeys(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		  WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		  loginButton.click();
	}

	@Then("System redirects to dashboard page {string}")
	public void system_redirects_to_dashboard_page(String pageHeader) throws InterruptedException {
	   System.out.println("Page Header... " +  pageHeader);
	   
	   System.out.println(driver.getTitle());
	   
	   Thread.sleep(2000);
	   driver.quit();
	}

 
	
	@Then("System redirects to dashboard pages {string}")
	public void system_redirects_to_dashboard_pages(String string) {
		try {
			System.out.println("aseetion failure...");
			//Assert.assertEquals("java", "not java");
			//Assert.fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
	   
		System.out.println("DONE...");
	}
 
}
