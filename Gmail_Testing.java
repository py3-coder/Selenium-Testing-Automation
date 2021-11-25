import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTC {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium-Setup\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
      driver.get("https://accounts.google.com/");
      driver.manage().window().maximize();
      driver.findElement(By.id("identifierId")).sendKeys("sau29gupgmail.com");
      Thread.sleep(3000);
      driver.findElement(By.className("VfPpkd-vQzf8d")).click();
      Thread.sleep(1000);
      String at =driver.getTitle();
      String et ="Sign in – Google accounts";
      driver.close();
      if(at.equalsIgnoreCase(et)) {
    	  System.out.println("TEST CASE PASS");
      }
      else {
    	  System.out.println("TEST CASE FAILED");
      }
	}

}
