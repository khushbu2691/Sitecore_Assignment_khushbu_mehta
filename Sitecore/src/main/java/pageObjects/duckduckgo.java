package pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class duckduckgo {

	public WebDriver driver;

	public String place1 = "Bahamas";
	public String place2 = "Amsterdam";

	@FindBy(css = ".module__title__link")
	WebElement title;

	public duckduckgo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void set_Place1() {

		WebElement myElement = driver.findElement(By.id("search_form_input_homepage"));
		String js = "arguments[0].setAttribute('value','" + place1 + "')";
		((JavascriptExecutor) driver).executeScript(js, myElement);

		WebElement element = driver.findElement(By.id("search_button_homepage"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", element);
	}

	public boolean verify_the_page() throws IOException {

		if (title.getText().contains(place1)) {
			System.out.println("We are on correct page");
			return true;

		}

		else
			return false;

	}

	public void take_a_screenshot() throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\src\\resources\\Screenshot.png";
		FileUtils.copyFile(src, new File(dest));

	}

	public void set_Place2() {

		WebElement myElement = driver.findElement(By.id("search_form_input"));
		String js = "arguments[0].setAttribute('value','" + place2 + "')";
		((JavascriptExecutor) driver).executeScript(js, myElement);

		WebElement element = driver.findElement(By.id("search_button"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", element);
	}
}
