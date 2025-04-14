package cucumber_project_mini;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom_miniproject {

	
	
	@FindBy(id = "username")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id = "Inpatient Ward")
	public static WebElement session;
	
	@FindBy(xpath = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")
	public static WebElement registration;
	
	@FindBy(id = "fr7692-field")
	public static WebElement fname;
	
	@FindBy(id = "fr9007-field")
	public static WebElement mname;
	
	@FindBy(id = "fr6230-field")
	public static WebElement lname;
	
	@FindBy(id = "next-button")
	public static WebElement nxt;
	
	@FindBy(id = "birthdateDay-field")
	public static WebElement day;
	
	@FindBy(id = "birthdateYear-field")
	public static WebElement year;
	
	@FindBy(id = "address1")
	public static WebElement address1;
	
	@FindBy(id = "address2")
	public static WebElement address2;
	
	@FindBy(id = "cityVillage")
	public static WebElement city;
	
	@FindBy(id = "stateProvince")
	public static WebElement state;
	
	@FindBy(id = "country")
	public static WebElement country;
	
	@FindBy(id = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(id = "fr9124-field")
	public static WebElement number;
	
	@FindBy(id = "submit")
	public static WebElement submit;
}
