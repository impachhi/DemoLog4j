package Day1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoJenkins {
	
	@Test
	void startApp() {
		Logger logger=Logger.getLogger(Logger.class.getClass());
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		logger.info("This s info msg");
		logger.debug("This is debu msg");
		logger.error("This is error msg");
		logger.fatal("This is fatal msg");
		
		
		
		driver.quit();
		

	}

}
