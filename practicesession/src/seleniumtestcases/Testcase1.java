package seleniumtestcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
		driver.findElement(By.id("Passwd")).sendKeys("YOUR PASSWORD");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		driver.close();

	}
}
