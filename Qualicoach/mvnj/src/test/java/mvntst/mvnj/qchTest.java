package mvntst.mvnj;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.courseSelector;
import pageObjects.login;

public class qchTest extends browserinit
{
	//Global Declarations
	String uName= "user87";
	String pwd="User@9135";
	
	//Test Cases
	@Test
	public void enter() throws IOException, InterruptedException
	{
		driver=initialize();
		driver.get("https://test.qualicoach.org/login/index.php");
		
		login l =new login(driver);
		l.username().sendKeys(uName);
		l.pass().sendKeys(pwd);
		l.ok().click();
		
		courseSelector c = new courseSelector(driver);
		c.scroll();
		c.select();
		
	}


}
