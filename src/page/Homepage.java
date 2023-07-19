package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	By noty=By.xpath("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button/span/span/svg/path");
	By place=By.xpath("//*[@id=\":Ra9:\"]");
	By dest=By.xpath("By place=By.xpath(\"//*[@id=\\\":Ra9:\\\"]\");");
	By date=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div");
	By dayin=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[4]/td[3]/span");
	By dayout=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[6]/span");
	By select=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/button");
	By child=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[2]/div[2]/button[2]");
	By room=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/button");
	By btn=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/button");
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;

	}
	public void placeclick()
	{
		driver.findElement(place).click();
		driver.findElement(dest).click();
	}
	public void datepick(String s)
	{
		driver.findElement(date).click();
		WebElement dateselect=driver.findElement(date);
		dateselect.sendKeys(s);
		
	}
	public void children()
	{
		driver.findElement(select).click();
		driver.findElement(child).click();
	}
	public void room()
	{
		driver.findElement(room).click();;
    }
	public void button()
	{
		driver.findElement(btn).click();
	}
	

}