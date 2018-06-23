package practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");

		// Using DropDown statically//
		// Select s = new
		// Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		// s.selectByValue("AED");
		// s.selectByIndex(3);
		// s.deselectByVisibleText("");
		// Using Dynamically

		// driver.findElement(By.xpath("//input[@value='Goa (GOI)']")).click();
		// driver.findElement(By.xpath("(//input[@value='Surat (STV)'])[2]")).click();

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

	}

}
