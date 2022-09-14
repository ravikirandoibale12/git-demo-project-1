package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selinium with java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    WebElement username = driver.findElement(By.xpath("//*[@name='FirstName']"));
	     
	    js.executeScript("arguments[0].value='ravikiradoibale';",username);
	    
	    WebElement lastname= driver.findElement(By.xpath("//*[@name='LastName']"));
	    
	    js.executeScript("arguments[0].value='rajendradoibale';",lastname);
	    
	    
	    WebElement mobileno= driver.findElement(By.xpath("//*[@name='Contact']"));
	     js.executeScript("arguments[0].value='8007054542';",mobileno);
	    
	     Thread.sleep(2000);
	    
	    WebElement email= driver.findElement(By.xpath("//*[@name='Email']"));
	    
	    js.executeScript("arguments[0].value='rdoibale@gmail.com';",email);

	}
}

