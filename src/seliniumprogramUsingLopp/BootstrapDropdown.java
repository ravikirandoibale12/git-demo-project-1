package seliniumprogramUsingLopp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","D:\\selinium with java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://zoom.us/signup");
	
	WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
	month.click();
	
	List<WebElement> monthvalue= driver.findElements(By.xpath("//*[contains(@id,'select-item-select-1-')]"));
	
	for (WebElement month1 :monthvalue)
{
	String month1text = month1.getText();
	
	System.out.println(month1text);
}

}
}