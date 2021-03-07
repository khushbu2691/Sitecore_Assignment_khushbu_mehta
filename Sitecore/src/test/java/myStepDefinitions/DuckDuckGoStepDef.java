package myStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.duckduckgo;

public class DuckDuckGoStepDef {

	WebDriver driver;

	@Given("^I navigate to the duckduckgo website$")
	public void i_navigate_to_the_duckduckgo_website() throws Throwable {

		// Set the browser and webdriver for the corresponding browser
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");

		driver = new ChromeDriver();

		// Hit the Url
		driver.get("https://duckduckgo.com");

		// Maximize the window for better view.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

	@When("^I Search for Bahamas$")
	public void i_Search_for_Bahamas() throws Throwable {

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		duckduckgo obj = new duckduckgo(driver);

		// Set the input value "Place1" as bahamas using a javascript.
		obj.set_Place1();
	}

	@Then("^the Screenshot is taken if the page is Bahamas$")
	public void the_Screenshot_is_taken_if_the_page_is_Bahamas() throws Throwable {

		duckduckgo obj = new duckduckgo(driver);

		// Verify the Page by comparing the title
		obj.verify_the_page();

		if (obj.verify_the_page()) {
			// Take a Screenshot if we are on right page
			obj.take_a_screenshot();
		}
	}

	@Then("^Searches for Amsterdam$")
	public void searches_for_Amsterdam() throws Throwable {

		duckduckgo obj = new duckduckgo(driver);

		// Set the input value "Place1" as bahamas using a javascript.
		obj.set_Place2();
	}
}