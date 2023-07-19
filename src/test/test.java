package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Homepage;

public class test {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.booking.com/");
				
	}
	@org.testng.annotations.Test
	public void home()throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		hp.placeclick();
		hp.datepick("20-07-2023");
		hp.children();
		hp.room();
		hp.button();
}
}