package practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.id("email")).sendKeys("this is my first code");
		driver.findElement(By.cssSelector("")).sendKeys("my program");
		driver.findElement(By.name("pass")).sendKeys("27921992");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
