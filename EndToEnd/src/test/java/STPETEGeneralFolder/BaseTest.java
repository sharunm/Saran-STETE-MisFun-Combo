package STPETEGeneralFolder;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver ;
	@BeforeTest
	public void initializeDriver()
	{
	//System.setProperty("webdriver.chrome.driver", "C://SeleniumWebDriver//chrome Driver//chromedriver 1.exe");  
		//ChromeOptions co = new ChromeOptions();
	    //co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));
	
		//WebDriverManager.chromedriver.setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

}
