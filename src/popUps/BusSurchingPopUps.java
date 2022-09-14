package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusSurchingPopUps {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selinium with java\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
        WebElement searchbutton = driver.findElement(By.xpath("//*[@name='searchBtn']"));
        searchbutton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        

	}
}
