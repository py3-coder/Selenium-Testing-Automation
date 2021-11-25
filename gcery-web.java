import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium-Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://gcreddy.com/project/admin/login.php");

		driver.findElement(By.name("username")).sendKeys("gcreddy");
		driver.findElement(By.name("password")).sendKeys("Temp@2020");
		Thread.sleep(1000);
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(4000);

		try {
		boolean linkExists = driver.findElement(By.linkText("Logoff")).isDisplayed();

		if (linkExists == true) {
		System.out.println("Admin Login is Successful – Passed");
		}
		}
		catch (NoSuchElementException e1) {
		System.out.println("Admin Login is Unsuccessful – Failed");
		}
		driver.close();

	}

}
