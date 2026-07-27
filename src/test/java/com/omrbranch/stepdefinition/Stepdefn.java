package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefn {

	WebDriver driver;

	@Given("User is on omrbranch page")
	public void k() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("User gives username and password")
	public void login() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kishorekk2511@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Kishore@123");
	}

	@When("User click the login button")
	public void btn() {
		WebElement btn = driver.findElement(By.xpath("//button[@class='bg-success w-100']"));
		btn.click();

	}

	@Then("User should verify success message after login")
	public void sm() {
		WebElement wel = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		String string = wel.getText();
		Assert.assertEquals("Verify Message", "Welcome Krishna", string);
	}

}
