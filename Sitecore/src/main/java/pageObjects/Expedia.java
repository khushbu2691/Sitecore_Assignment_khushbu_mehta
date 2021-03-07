package pageObjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia {
	
	public WebDriver driver;
	
	public Expedia(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Find the input text for destination
	@FindBy(xpath = "//*[@aria-label='Going to']") 
	WebElement dest;
	
	//Find the input field for destination
	public WebElement fill_dest()
	{
		return dest;
	}

	// Find the list of dropdown for destination
	@FindBy(css  = ".uitk-typeahead-results > li > button > div > div > span > strong") 
	List<WebElement> arrivals;
	
	//Find list of elements
	public List<WebElement> list_of_destination()
	{
		return arrivals;
	}
	
	//Find the flight check box
	@FindBy(id = "add-flight-switch") 
	WebElement add_flight_switch;
	
	//return the add_flight check box
	public WebElement add_flight()
	{
		return add_flight_switch;
	}
	

	//Find the input text for Source
	@FindBy(xpath = "//*[@aria-label='Leaving from']") 
	WebElement src;
	
	//Find the input field for Source
	public WebElement fill_src()
	{
		return src;
	}
	
	// Find the list of dropdown for Source
	@FindBy(xpath = "//li[contains(@class, 'is-child uitk-typeahead-result-item')]//button //div //div //span //strong") 
	List<WebElement> departures;
	
	//Find list of elements
	public List<WebElement> list_of_src()
	{
		return departures;
	}
	
	//Find the traveller
	@FindBy(xpath = "//*[@aria-label='1 room, 2 travelers']") 
	WebElement travellers;
	
	//Find the input field for Source
	public WebElement select_travellers()
	{
		return travellers;
	}
	
	//Find Button to decrease the num of adults
	@FindBy(css = ".adultStepInput .uitk-flex > button") 
	WebElement button_adult;
	
	//Find the input field for Source
	public WebElement decrease_adult()
	{
		return button_adult;
	}
	
	//Find date
	@FindBy(css = "#d1-btn") 
	WebElement date;
	
	//Find the input field for Source
	public WebElement find_date()
	{
		return date;
	}
	
	//Find start date
	@FindBy(xpath = "//*[@aria-label='Apr 10, 2021.']") 
	WebElement start_date;
	
	//Find the input field for Source
	public WebElement find_Start_date()
	{
		return start_date;
	}
	
	//Find End date
	@FindBy(xpath = "//*[@aria-label='Apr 15, 2021.']") 
	WebElement end_date;
	
	//Find the input field for Source
	public WebElement find_End_date()
	{
		return end_date;
	}
	
	//Find Search for the selected Date
	@FindBy(css = ".uitk-flex-align-self-flex-end") 
	WebElement search_date;
	
	//Find the input field for Source
	public WebElement date_search_button()
	{
		return search_date;
	}
	
	//Find Search button to get the flights
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement search_flight;
	
	//Find the input field for Source
	public WebElement flight_search_button()
	{
		return search_flight;
	}
}
