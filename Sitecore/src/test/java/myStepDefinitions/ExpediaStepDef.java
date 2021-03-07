package myStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Expedia;

public class ExpediaStepDef {

	WebDriver driver;
	String Source = "Brussels";
	String Destination = "New York";

	@Given("^I navigate to the Expedia website$")
	public void i_navigate_to_the_Expedia_website() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
	}

	@When("^I look for a flight and accommodation from Brussels to New York$")
	public void i_look_for_a_flight_and_accommodation_from_Brussels_to_New_York() throws Throwable {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Expedia exp_obj = new Expedia(driver);
		
		//Fill the destination
		exp_obj.fill_dest().sendKeys(Destination);
		
		//Select the appropriate destination from the dropdown
		for (WebElement arrival : exp_obj.list_of_destination()){
			
			if (arrival.getText().equalsIgnoreCase(Destination)){
				
				arrival.click();
				break;
			}
		}

		// Check the flight checkbox
		exp_obj.add_flight().click();

		//Fill the source
		exp_obj.fill_src().sendKeys(Source);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Select the appropriate Source from the dropdown
		for (WebElement departure : exp_obj.list_of_src()) {
			if (departure.getText().equalsIgnoreCase(Source)) {
				wait.until(ExpectedConditions.elementToBeClickable(departure));
				departure.click();
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(exp_obj.select_travellers()));
		
		// Select the link for travellers
		exp_obj.select_travellers().click();

		// Decrease 1 adult if 2 are already selected.
		exp_obj.decrease_adult().click();

		// Select 1 Child if none is already selected
		Actions act = new Actions(driver);
		WebElement childIncrease = driver
				.findElement(By.cssSelector(".childStepInput .uitk-flex > button:nth-of-type(2)"));

		// Select Age of child as 3
		act.click(childIncrease).build().perform();
		driver.findElement(By.xpath("//option[text()='3']")).click();

		// Select Done for child and adult selection
		driver.findElement(By.cssSelector(".uitk-button-floating")).click();

		// Select date
		exp_obj.find_date().click();

		// Select Start date
		exp_obj.find_Start_date().click();

		wait.until(ExpectedConditions.visibilityOf(exp_obj.find_End_date()));
		
		// Select End Date
		exp_obj.find_End_date().click();

		// Save the date and exit
		exp_obj.date_search_button().click();

		// Search for this form
		exp_obj.flight_search_button().click();

	}

	@Then("^the result page contains travel option for the chosen destination$")
	public void the_result_page_contains_travel_option_for_the_chosen_destination() throws Throwable {

		// Verify that page contains the chosen source and Destination

		Assert.assertTrue(driver.findElement(By.id("trip-origin-input")).getAttribute("value").contains(Source));
		System.out.println(Source);
		Assert.assertTrue(
				driver.findElement(By.id("hotels-destination-input")).getAttribute("value").contains(Destination));
		System.out.println(Destination);

	}

}
