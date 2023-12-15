package STPETEGeneralFolder;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicFuctionalities extends BaseTest{
	
	@Test()
	public void searchBar()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Saranya Sridharan", Keys.ENTER);
	}
	
	@Test(dependsOnMethods ={"searchBar"})
	public void takeScreenshot() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"//screenshot.png"));
	}
	
	@Test
	 public void TravelCalender() throws InterruptedException
	 {
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement scrollelement = driver.findElement(By.xpath("//input[@placeholder='Date of travel']"));
				js.executeScript("arguments[0].scrollIntoView();", scrollelement);
				Thread.sleep(4000);
				scrollelement.click();
				
	 }
	

}
