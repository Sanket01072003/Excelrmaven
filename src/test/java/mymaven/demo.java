package mymaven;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	

	static WebDriver driver;
	static Logger logger=LogManager.getLogger(demo.class);
	public static void open_the_browser() {
		
		driver=new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/?_rdr");
	  logger.debug("website opened");
	  logger.info("website opened");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		open_the_browser();
	}

}
