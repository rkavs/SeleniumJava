package practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("viralireddy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123433");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
