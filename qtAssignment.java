package practice;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class qtAssignment 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 														// creating the instance of chromedriver.
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("http://www.qaclickacademy.com/practice.php"); 									// Navigating to the given Link
		
		exerciseone(driver); 																		// accessing the static method function.
		exercisetwo(driver);
		exercisethree(driver);
		exercisefour(driver);
		exercisefourpointone(driver);
		exercisefourpointtwo(driver);
		exerciseFive(driver);
		exerciseSeven(driver);
		exerciseEight(driver);
		exerciseNine(driver);
		exerciseSix(driver);

	}

	public static void exerciseone(WebDriver driver) throws InterruptedException 
	{

		driver.findElement(By.xpath("//*[@value='radio1']")).click(); 								// radio button 1 is identified using xpath and is clicked	
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio1']")).isSelected());		//Proceed only if radio 1 is selected
		Thread.sleep(1000); 																		// for user convinience
		driver.findElement(By.xpath("//*[@value='radio2']")).click();								//radio button 2 check
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio2']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='radio3']")).click();								//radio button 3 check
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio3']")).isSelected());

	}

	public static void exercisetwo(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.id("autocomplete")).sendKeys("United States"); 						// Find select countries and send united states
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for (int i=0; i<options.size();i++)															//Using For loop to iterate through the list of options
		{ 
			if (options.get(i).getText().equalsIgnoreCase("United States Minor Outlying Islands")) 
			{
				options.get(i).click();
				break;
			}

		}

	}

	public static void exercisethree(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.id("dropdown-class-example")).click(); 								// find and click the dropdown and select options
		driver.findElement(By.xpath("//option[@value='option1']")).click();							// find and select option 1
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='option2']")).click();							// find and select option 2
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='option3']")).click();							// find and select option 3
	}

	public static void exercisefour(WebDriver driver) throws InterruptedException 
	{

		driver.findElement(By.id("checkBoxOption1")).click();										// find and select checkbox option 1
		Thread.sleep(100);
		driver.findElement(By.id("checkBoxOption1")).click();										// find and deselect checkbox option 1										
		driver.findElement(By.id("checkBoxOption2")).click();										// find and select checkbox option 2
		Thread.sleep(100);
		driver.findElement(By.id("checkBoxOption2")).click();										// find and deselect checkbox option 2
		driver.findElement(By.id("checkBoxOption3")).click();										// find and select checkbox option 3
		Thread.sleep(100);
		driver.findElement(By.id("checkBoxOption3")).click();										// find and deselect checkbox option 3
		Thread.sleep(1500);

	}
	
	public static void exercisefourpointone(WebDriver driver) throws InterruptedException
	{																								//This method is written in a similar fashion to select all of the checkbox options
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption2")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
		
		driver.findElement(By.id("checkBoxOption3")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());
		Thread.sleep(1500);
	}
	
	public static void exercisefourpointtwo(WebDriver driver) throws InterruptedException			//This method is written in a similar fashion to deselect all of the checkbox options
	{
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(100);
		driver.findElement(By.id("checkBoxOption2")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
		Thread.sleep(100);
		driver.findElement(By.id("checkBoxOption3")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
	}
	
	public static void exerciseFive(WebDriver driver) throws InterruptedException 
	{

		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("openwindow")).click();											//find and select openwindow in the practice webpage
		Set<String> newWindow = driver.getWindowHandles();											//to get the number of windows opened and their indexes
		Iterator<String> it = newWindow.iterator();													//to iterate through each window
		String parentid = it.next();																//Assigning id of parent window to switch back
		Thread.sleep(1500);
		driver.switchTo().window(parentid);															//switch back to parent window
		
	}
	
	public static void exerciseSix(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("opentab")).click();												//find and select open tab button
		Set<String> newTab = driver.getWindowHandles();												//new tab is considered as a new window itself
		Iterator<String> it = newTab.iterator();
		it.next();
		String child=it.next();
		driver.switchTo().window(child);
		Thread.sleep(1500);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void exerciseSeven(WebDriver driver) throws InterruptedException 
	{
		
		driver.findElement(By.id("name")).sendKeys("Nikhil");										// find textbox called as name to pass characters and trigger alert window based on the characters given
		Thread.sleep(1500);
		driver.findElement(By.id("alertbtn")).click();												//click alert button to trigger alert
		Thread.sleep(500);
		driver.switchTo().alert().accept();															//.accept() is used to accept the alert

	}
	
	public static void exerciseEight(WebDriver driver) throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;										// any javascript to be executed is first instantiated using this statement
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,600)");												//first make the table visible by scrolling to its point
		Thread.sleep(1500);
		jse.executeScript("document.querySelector('.tableFixHead').scrollBy(0,6000)");				//scroll to the bottom using internal scrollbar
		Thread.sleep(1000);
	}
	
	private static void exerciseNine(WebDriver driver) throws InterruptedException 
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.id("mousehover"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).click().build().perform();										//click on that button
		Thread.sleep(500);
		WebElement mouseClick = driver.findElement(By.cssSelector("a[href='#top']"));				//find and click on the top option 
		Thread.sleep(2000);
		a.moveToElement(mouseClick).click().build().perform();
		Thread.sleep(500);
	}
}