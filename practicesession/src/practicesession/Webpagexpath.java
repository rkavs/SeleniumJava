package practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpagexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.justfab.com/?action=brand.login");
		// locators using Xpath
		// driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[1]/td/input")).sendKeys("viralireddy@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[2]/td/input")).sendKeys("ambri272792");
		// driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[4]/td/button")).click();

		// locators using CSS
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("virali");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("27827");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
