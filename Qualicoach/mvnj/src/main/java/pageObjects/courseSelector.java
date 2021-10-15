package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class courseSelector 
{
	public WebDriver driver;
	
	public courseSelector(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(500);
	}
	
	public void select() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//div[@class='course grid']/div[4]/i/img"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);
		
		WebElement mouseClick = driver.findElement(By.xpath("//div[@class='course grid']/div[4]/a/p"));
		a.moveToElement(mouseClick).click().build().perform();
	}

}
