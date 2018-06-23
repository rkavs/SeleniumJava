package practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolatexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab2\"]/body/section/div/div/div/div/ul/li[3]")).click();

		// driver.findElement(By.xpath("//[@id=\"tablist1-tab2\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"tablist1-tab3\"]")).click();

	}

}
