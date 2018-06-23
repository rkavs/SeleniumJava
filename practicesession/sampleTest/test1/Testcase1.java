package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.TestPage1;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testcase1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	    System.setProperty("webdriver.firefox.marionette","pathToGeckodriver");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://twhyderabad.github.io/demo_site/");
	}
	@Test(priority=5)
	public void verify1()
	{
	    TestPage1 login=new TestPage1(driver);
	    login.set_username("admin");
	    login.set_password("admin");
	    login.click_button();
	    Assert.assertTrue(driver.getPageSource().contains("Blog"));
	}
	@Test(priority=1)
	public void verify2()
	{
	    TestPage1 login=new TestPage1(driver);
	    login.set_username("adm");
	    login.set_password("admin");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
	}
	@Test(priority=2)
	public void verify3()
	{
	    TestPage1 login=new TestPage1(driver);
	    login.set_username("admin");
	    login.set_password("adm");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
	}
	@Test(priority=3)
	public void verify4()
	{
	    TestPage1 login=new TestPage1(driver);
	    login.set_username("adm");
	    login.set_password("adm");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
	}
	@Test(priority=4)
	public void verify5()
	{
	    TestPage1 login=new TestPage1(driver);
	    login.set_username("");
	    login.set_password("");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
	}
	@AfterTest
	public void close()
	{
	    driver.close();
	}
}
