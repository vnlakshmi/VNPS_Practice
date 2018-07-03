package takeScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class GoogleScreenshots {
	
	@Test
	public void captureScreenshots() throws IOException, InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vnagalak\\Automation_Selenium\\Selenium\\Sel Configuration\\Geckodriver FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//WebElement AMZ = driver.findElement((By.xpath(("//a [@id='nav-link-shopall']/span[2]"))));
		WebElement AMZ = driver.findElement((By.xpath("//*[text()='Departments']")));
		AMZ.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/Screenshots1.png"));
		
		
		driver.quit();
		
	}
	
	

}
