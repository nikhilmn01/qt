package practice;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class qtAssignment 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			// creating the instance of chromedriver.
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("http://www.qaclickacademy.com/practice.php "); 			// Navigating to the given Link
		
		exerciseone(driver); 							// accessing the static method function.
		exercisetwo(driver);
		exercisethree(driver);
		exercisefour(driver);

	}

	public static void exerciseone(WebDriver driver) throws InterruptedException 
	{

		driver.findElement(By.xpath("//*[@value='radio1']")).click(); 		// radio button 1 is identified using xpath and is clicked	
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio1']")).isSelected());		//Proceed only if radio 1 is selected
		Thread.sleep(1000); 							// for user convinience
		driver.findElement(By.xpath("//*[@value='radio2']")).click();		//radio button 2 check
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio2']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='radio3']")).click();		//radio button 3 check
		Assert.assertTrue(driver.findElement(By.xpath("//*[@value='radio3']")).isSelected());

	}

	public static void exercisetwo(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.id("autocomplete")).sendKeys("United States"); // Find select countries and send united states
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for (int i=0; i<options.size();i++)				//Using For loop to iterate through the list of options
		{ 

//			System.out.println(options.get(i).getText());
			if (options.get(i).getText().equalsIgnoreCase("United States Minor Outlying Islands")) 
			{
				options.get(i).click();
				break;
			}

		}

	}

	public static void exercisethree(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.id("dropdown-class-example")).click(); // find and click the dropdown and select options
		driver.findElement(By.xpath("//option[@value='option1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='option2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='option3']")).click();
	}

	public static void exercisefour(WebDriver driver) throws InterruptedException {

		driver.findElement(By.name("checkBoxOption1")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkBoxOption2")).click();
		driver.findElement(By.name("checkBoxOption3")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkBoxOption3")).click();

	}
}