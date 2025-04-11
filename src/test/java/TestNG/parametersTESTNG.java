package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class parametersTESTNG {

	static WebDriver driver;
	
	@Test
	@Parameters("username")
	 public void orangehrm(String uname) {
			System.out.println(uname);
	}

}
	
