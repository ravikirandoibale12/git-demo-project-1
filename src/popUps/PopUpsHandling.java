package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsHandling {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selinium with java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement alertbotton = driver.findElement(By.xpath("//*[@name='confirmation']"));
		
		
		alertbotton.click();
		
		
		
		Thread.sleep(2000);
		
	//	driver.switchTo().alert().dismiss();
		
		//handling the alert pop ups by clicking on ok button 
				
	   String textonalert = driver.switchTo().alert().getText();
	     System.out.println(textonalert);
		
	     driver.switchTo().alert().accept();	

		 
		
	}

}
